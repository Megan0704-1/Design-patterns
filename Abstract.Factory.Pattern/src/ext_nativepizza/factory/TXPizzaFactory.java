package ext_nativepizza.factory;

import ext_nativepizza.pizzas.Pizza;
import ext_nativepizza.TXpizzas.*;

public class TXPizzaFactory extends SimplePizzaFactory{
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }

        return pizza;
    }
}
