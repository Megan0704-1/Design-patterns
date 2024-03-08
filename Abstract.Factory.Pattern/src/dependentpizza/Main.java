package dependentpizza;

import nativepizza.pizzas.Pizza;

public class Main{
    public static void main(String[] args){
        DependentPizzaStore store = new DependentPizzaStore();
        Pizza pizza = store.createPizza("cheese");
    }
}
