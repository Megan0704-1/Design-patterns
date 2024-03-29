package ext_nativepizza.pizzas;

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

    public abstract void cut(); 

    public abstract void bake();

    public abstract void box();
}
