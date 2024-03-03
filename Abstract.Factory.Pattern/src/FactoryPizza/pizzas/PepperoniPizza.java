package FactoryPizza.pizzas;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Refular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Pepperoni Pizza");
    }
    @Override
    public void bake(){
        System.out.println("Baking Pepperoni Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting Pepperoni Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing Pepperoni Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
