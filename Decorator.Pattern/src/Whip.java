// Concrete Decorator: Whip class //

public class Whip extends BaseDecorator {
    // Whip extends BaseDecorator, Basedecorator inherit Beverage
    
    public Whip(Beverage bev){
        // Whip decorator takes a Beverage class as argument when instantiates
        this.coffee = bev; // A ref to the object I want to wrap
    }
    public String getDescription(){
        return this.coffee.getDescription() + " + whip";
    }

    public double cost(){
        return this.coffee.cost() + 30;
    }
}
