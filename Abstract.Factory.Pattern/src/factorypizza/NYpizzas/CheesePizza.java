package factorypizza.NYpizzas;

import factorypizza.pizzas.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "NY Cheese Pizza";
        dough = "Thin Crust";
        sauce = "New York Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing NY Cheese Pizza");
    }
    @Override
    public void bake(){
        System.out.println("Baking NY Cheese Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting NY Cheese Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing NY Cheese Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
