package factorypizza;

import factorypizza.pizzas.Pizza;
import factorypizza.stores.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("tonight, I would like to have some...");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        System.out.println("\nNY Store:");
        PizzaStore nystore = new NYPizzaStore();
        Pizza nypizza = nystore.orderPizza(type);
        
        System.out.println("\nTX Store:");
        PizzaStore txstore = new TXPizzaStore();
        Pizza txpizza = txstore.orderPizza(type);
    }
}
