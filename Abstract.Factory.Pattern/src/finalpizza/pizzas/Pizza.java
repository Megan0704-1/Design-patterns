package finalpizza.pizzas;

import finalpizza.IngredientFactory.DoughFactory.*;
import finalpizza.IngredientFactory.SauceFactory.*;

public abstract class Pizza{
    public String name;
    public Dough dough;
    public Sauce sauce;

    abstract void prepare();
    void back(){
        System.out.println("Bake for 25 minutes at 350 celcius");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) this.name = name;
    void getName() return name;
}
