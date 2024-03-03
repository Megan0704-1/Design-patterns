package ext_nativepizza.TXpizzas;

import ext_nativepizza.pizzas.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "TX Cheese Pizza";
        dough = "Thin Crust";
        sauce = "Texas Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing TX Cheese Pizza");
    }
    @Override
    public void bake(){
        System.out.println("Baking TX Cheese Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting TX Cheese Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing TX Cheese Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
