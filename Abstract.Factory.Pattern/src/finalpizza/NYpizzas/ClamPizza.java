package finalpizza.NYpizzas;

import finalpizza.pizzas.Pizza;
import finalpizza.IngredientFactory.*;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientfactory;

    public ClamPizza(PizzaIngredientFactory igf) {
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
        System.out.println("Baking NY Clam Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting NY Clam Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing NY Clam Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
