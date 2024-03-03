package ext_nativepizza;

import ext_nativepizza.factory.*;
import ext_nativepizza.pizzas.Pizza;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("tonight, I would like to have some...");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        System.out.println("Regular store:\n");
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza(type);
        
        System.out.println("NY Store:\n");
        NYPizzaFactory nyfactory = new NYPizzaFactory();
        PizzaStore nystore = new PizzaStore(nyfactory);
        Pizza nypizza = nystore.orderPizza(type);
        
        System.out.println("TX Store:\n");
        TXPizzaFactory txfactory = new TXPizzaFactory();
        PizzaStore txstore = new PizzaStore(txfactory);
        Pizza txpizza = txstore.orderPizza(type);
    }
}
