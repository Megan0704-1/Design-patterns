package factorypizza.NYpizzas;

import factorypizza.pizzas.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "NY Pepperoni Pizza";
        dough = "Thin Crust";
        sauce = "New York Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void box(){
        System.out.println("Boxing NY Pepperoni Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
