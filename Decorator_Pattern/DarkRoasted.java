// Concrete component: DarkRoasted class //

public class DarkRoasted extends Beverage {

    //constructor
    public DarkRoasted(){
        description = "Order DarkRoasted Coffee"; //description instance var is inherited from Beverage super class
    }

    public double cost() {
        return 140;
    }
}