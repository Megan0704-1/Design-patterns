public class CoffeShop {
    public static void main(String args[]){
        Beverage coffee = new Espresso();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Mocha(decaf);
        decaf = new Mocha(decaf);
        Checkout(decaf);

        Beverage dr = new DarkRoasted();
        dr = new Whip(dr);
        dr = new Whip(dr);
        dr = new Mocha(dr);
        dr = new Milk(dr);
        Checkout(dr);

    }

    public static void Checkout(Beverage bev){
        System.out.println(bev.getDescription() + " $" + bev.cost());
    }
}
