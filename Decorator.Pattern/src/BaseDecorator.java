// Base decorator class //
public abstract class BaseDecorator extends Beverage {
    // using Beverage as supertype

    // this is the beverage that each decorator will be wrapping
    Beverage coffee; //instance variable

    public abstract String getDescription();
}
