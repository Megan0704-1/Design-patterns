// Concrete component: Espresso, inherited from Beverage //

public class Espresso extends Beverage {

    //constructor
    public Espresso(){
        description = "Order Espresso"; //description instance var is inherited from Beverage super class
    }

    public double cost() {
        return 200;
    }
}