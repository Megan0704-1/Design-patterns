// Concrete component: HouseBlend class inherit from Beverage //

public class HouseBlend extends Beverage {

    //constructor
    public HouseBlend(){
        description = "Order HouseBlend Coffee"; //description instance var is inherited from Beverage super class
    }

    public double cost() {
        return 100;
    }
}