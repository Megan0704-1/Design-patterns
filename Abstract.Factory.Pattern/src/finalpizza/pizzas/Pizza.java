package finalpizza.pizzas;

import finalpizza.IngredientFactory.DoughFactory.*;
import finalpizza.IngredientFactory.SauceFactory.*;

public abstract class Pizza{
    public String name;
    public Dough dough;
    public Sauce sauce;

    public abstract void prepare(); 

    public void cut(){
        System.out.println("Cutting the pizza");
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350 celcius");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}
