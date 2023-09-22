// Concrete decorator: Milk class //

public class Milk extends BaseDecorator {
    
    public Milk(Beverage bev){
        this.coffee = bev;
    }
    public String getDescription(){
        return this.coffee.getDescription() + " + milk";
    }

    public double cost(){
        return this.coffee.cost() + 20;
    }
}