package factorypizza.pizzas;

import java.util.ArrayList;

public abstract class Pizza{
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    public void cut(){
        System.out.println("Cutting the pizza");
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350 celcius");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
