package factorypizza.NYpizzas;

import factorypizza.pizzas.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "NY Clam Pizza";
        dough = "Thin Crust";
        sauce = "New York Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing NY Clam Pizza");
    }
    @Override
    public void bake(){
        System.out.println("Baking NY Clam Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting NY Clam Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing NY Clam Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
