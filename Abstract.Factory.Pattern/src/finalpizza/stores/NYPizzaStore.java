package finalpizza.stores;

import finalpizza.pizzas.Pizza;
import finalpizza.NYpizzas.*;
import finalpizza.IngredientFactory.*;

public class NYPizzaStore extends PizzaStore{

    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Cheese Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Clam Pizza");
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Pepperoni Pizza");
        }

        return pizza;
    }
}
