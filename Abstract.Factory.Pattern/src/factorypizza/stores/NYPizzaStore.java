package factorypizza.stores;

import factorypizza.pizzas.Pizza;
import factorypizza.NYpizzas.*;

public class NYPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new CheesePizza();
        }else if(type.equals("clam")){
            return new ClamPizza();
        }else if(type.equals("pepperoni")){
            return new PepperoniPizza();
        }else return null;
    }
}
