package finalpizza.TXpizzas;

import finalpizza.pizzas.Pizza;
import finalpizza.IngredientFactory.*;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientfactory;

    public PepperoniPizza(PizzaIngredientFactory igf) {
        this.ingredientfactory = igf;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientfactory.createDough();
        sauce = ingredientfactory.createSauce();
        System.out.println("ingredients: " + dough.description + ", " + sauce.description);
    }

    @Override
    public void bake(){
        System.out.println("Baking TX Pepperoni Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting TX Pepperoni Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing TX Pepperoni Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
