#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>


typedef enum {
    TOKEN_INT,
    TOKEN_PLUS,
    TOKEN_MINUS,
    TOKEN_MUL,
    TOKEN_DIV,
    TOKEN_LPAREN,
    TOKEN_RPAREN,
    TOKEN_EOF
} TokenType;

typedef struct {
    TokenType type;
    int value;
} Token;

typedef struct {
    Token tokens[100];
    int num_tokens;
    int current_token;
} Lexer;

int parse_expressions(Lexer* lexer);
int parse_terms(Lexer* lexer);
int parse_factors(Lexer* lexer);

void init_lexer(Lexer *lexer){
    lexer->num_tokens = 0;
    lexer->current_token = 0;
}

void lex(const char *input, Lexer* lexer){
    int i=0; 
    while(input[i] != '\0'){
        if(isdigit(input[i])){
            char * endptr;
            lexer->tokens[lexer->num_tokens].type = TOKEN_INT;
            lexer->tokens[lexer->num_tokens].value = strtol(input[i], &endptr, 10);
            i = endptr - input;
            lexer->num_tokens++;
        }else{
            switch(input[i]){
                case '+': lexer->tokens[lexer->num_tokens++].type = TOKEN_PLUS; break;
                case '-': lexer->tokens[lexer->num_tokens++].type = TOKEN_MINUS; break;
                case '*': lexer->tokens[lexer->num_tokens++].type = TOKEN_MUL; break;
                case '/': lexer->tokens[lexer->num_tokens++].type = TOKEN_DIV; break;
                case '(': lexer->tokens[lexer->num_tokens++].type = TOKEN_LPAREN; break;
                case ')': lexer->tokens[lexer->num_tokens++].type = TOKEN_RPAREN; break;
                case ' ': i++; continue;
                default:
                          fprintf(stderr, "Lexer error: Unexpexted character %c\n", input[i]);
                          exit(EXIT_FAILURE);
                          break;
            }
        }
    }
    lexer->tokens[lexer->num_tokens++].type = TOKEN_EOF;
}


int parse_expressions(Lexer* lexer){
    int result = parse_terms(lexer);
    while(lexer->tokens[lexer->current_token].type == TOKEN_PLUS || lexer->tokens[lexer->current_token].type == TOKEN_MINUS){
        TokenType op = lexer->tokens[lexer->current_token].type;
        lexer->current_token++;
        if(op == TOKEN_PLUS){
            result += parse_terms(lexer);
        }else if(op == TOKEN_MINUS){
            result -= parse_terms(lexer);
        }
    }
    return result;
}

int parse_terms(Lexer *lexer){
    int result = parse_factors(lexer);
    while(lexer->tokens[lexer->current_token].type == TOKEN_MUL || lexer->tokens[lexer->current_token].type == TOKEN_DIV) {
        TokenType op = lexer->tokens[lexer->current_token].type;
        lexer->current_token++;
        if( op == TOKEN_MUL){
            result *= parse_factors(lexer);
        }else if(op == TOKEN_DIV) {
            result /= parse_factors(lexer);
        }
    }
    return result;
}

int parse_factors(Lexer *lexer) {
    if(lexer->tokens[lexer->current_token].type == TOKEN_INT){
        int value = lexer->tokens[lexer->current_token].value;
        lexer->current_token ++;
        return value;
    }

    if(lexer->tokens[lexer->current_token].type == TOKEN_LPAREN) {
        lexer->current_token ++;
        int result = parse_expressions(lexer);

        if(lexer->tokens[lexer->current_token].type != TOKEN_RPAREN){
            fprintf(stderr, "Parse Error: Expected ')'\n");
            exit(EXIT_FAILURE);
        }

        lexer->current_token++;
        return result;
    }else{
        fprintf(stderr, "Parse Error: Unexpected token\n");
        exit(EXIT_FAILURE);
    }
}

int main(){
    const char* input = "350 + 900 / 5 - 350 - 180 * 5";
    printf("formula: %s\n", input);
    Lexer lexer;
    printf("lexer\n");
    init_lexer(&lexer);
    printf("initializing lexer\n");
    lex(input, &lexer);
    printf("lexima\n");
    int result = parse_expressions(&lexer);
    printf("Result of input: %s = %d", input, result);
    return 0;
}


