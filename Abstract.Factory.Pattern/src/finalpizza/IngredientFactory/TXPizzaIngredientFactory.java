package finalpizza.IngredientFactory;

import finalpizza.IngredientFactory.DoughFactory.*;
import finalpizza.IngredientFactory.SauceFactory.*;

public class TXPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough(){
        return new ThickDough();
    }
    public Sauce createSauce(){
        return new OMGSauce();
    }
}
