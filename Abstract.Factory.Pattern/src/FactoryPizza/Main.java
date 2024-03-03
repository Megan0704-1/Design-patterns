package FactoryPizza;

import FactoryPizza.factory.*;
import FactoryPizza.pizzas.Pizza;

public class Main{
    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("cheese");
    }
}
