package factorypizza.TXpizzas;

import factorypizza.pizzas.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "TX Pepperoni Pizza";
        dough = "Thin Crust";
        sauce = "Texas Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing TX Pepperoni Pizza");
    }
    @Override
    public void bake(){
        System.out.println("Baking TX Pepperoni Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting TX Pepperoni Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing TX Pepperoni Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
