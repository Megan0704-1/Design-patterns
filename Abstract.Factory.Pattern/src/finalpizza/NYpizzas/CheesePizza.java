package finalpizza.NYpizzas;

import finalpizza.pizzas.Pizza;
import finalpizza.IngredientFactory.*;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ifactory;

    public CheesePizza(PizzaIngredientFactory igf) {
        this.ifactory = igf;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ifactory.createDough();
        sauce = ifactory.createSauce();
        System.out.println("Dough using: " + dough.getName());
        System.out.println("Sauce using: " + sauce.getName());
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
