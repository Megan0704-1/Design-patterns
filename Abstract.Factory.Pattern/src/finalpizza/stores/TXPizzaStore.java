package finalpizza.stores;

import finalpizza.pizzas.Pizza;
import finalpizza.NYpizzas.*;
import finalpizza.IngredientFactory.*;

public class TXPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new TXPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Texas Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Texas Clam Pizza");
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Texas Pepperoni Pizza");
        }

        return pizza;
    }
}
