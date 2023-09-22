// Concrete Decorator: Mocha class //

public class Mocha extends BaseDecorator {
    // Mocha extends BaseDecorator, Basedecorator inherit Beverage
    
    public Mocha(Beverage bev){
        // Mocha decorator takes a Beverage class as argument when instantiates
        this.coffee = bev; // A ref to the object I want to wrap
    }
    public String getDescription(){
        return this.coffee.getDescription() + " + mochacha";
    }

    public double cost(){
        return this.coffee.cost() + 14;
    }
}