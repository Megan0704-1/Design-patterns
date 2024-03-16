package finalpizza.IngredientFactory;

import finalpizza.IngredientFactory.DoughFactory.*;
import finalpizza.IngredientFactory.SauceFactory.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough(){
        return new ThinDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
}
