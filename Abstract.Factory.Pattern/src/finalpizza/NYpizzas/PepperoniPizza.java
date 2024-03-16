package finalpizza.NYpizzas;

import finalpizza.pizzas.Pizza;
import finalpizza.IngredientFactory.*;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ifactory;

    public PepperoniPizza(PizzaIngredientFactory igf) {
        this.ifactory = igf;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ifactory.createDough();
        sauce = ifactory.createSauce();
        System.out.println("Dough using: " + dough);
        System.out.println("Sauce using: " + sauce);
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
