package NativePizza.pizzas;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Refular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Clam Pizza");
    }
    @Override
    public void bake(){
        System.out.println("Baking Clam Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cutting Clam Pizza");
    }
    @Override
    public void box(){
        System.out.println("Boxing Clam Pizza");
    }

    // we can override the prepare method if the preparation of a pizza is different.
}
