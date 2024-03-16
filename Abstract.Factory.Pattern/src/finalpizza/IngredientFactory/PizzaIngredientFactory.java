package finalpizza.IngredientFactory;

import finalpizza.IngredientFactory.DoughFactory.*;
import finalpizza.IngredientFactory.SauceFactory.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
}
