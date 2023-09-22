// Concrete component: Decaf class //

public class Decaf extends Beverage {

    //constructor
    public Decaf(){
        description = "Order Decaf Coffee"; //description instance var is inherited from Beverage super class
    }

    public double cost() {
        return 90;
    }
}