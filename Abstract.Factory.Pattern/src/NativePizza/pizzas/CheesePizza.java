package NativePizza.pizzas;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Refular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Cheese Pizza");
    }
    @Override
    public void bake(){
        System.out.println("Baking Cheese Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting Cheese Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing Cheese Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
