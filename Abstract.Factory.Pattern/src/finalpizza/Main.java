package finalpizza;

import finalpizza.pizzas.Pizza;
import finalpizza.stores.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("tonight, I would like to have some... Pizza!");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        System.out.println("\nNY Store:");
        NYPizzaStore nystore = new NYPizzaStore();
        Pizza nypizza = nystore.orderPizza(type);
        
        System.out.println("\nTX Store:");
        TXPizzaStore txstore = new TXPizzaStore();
        Pizza txpizza = txstore.orderPizza(type);
    }
}
