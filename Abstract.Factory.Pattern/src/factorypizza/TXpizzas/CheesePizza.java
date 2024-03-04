package factorypizza.TXpizzas;

import factorypizza.pizzas.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "TX Cheese Pizza";
        dough = "Extra Thick Crust";
        sauce = "Potato Sauce";
        toppings.add("Tomato");
        toppings.add("Parmesan");
    }

    @Override
    public void cut(){
        System.out.println("Cutting pizzas into square slices");
    }

    @Override
    public void box(){
        System.out.println("Boxing TX Cheese Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
