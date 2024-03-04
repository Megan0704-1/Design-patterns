package factorypizza.TXpizzas;

import factorypizza.pizzas.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "TX Clam Pizza";
        dough = "Thin Crust";
        sauce = "Texas Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void box(){
        System.out.println("Boxing TX Clam Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
