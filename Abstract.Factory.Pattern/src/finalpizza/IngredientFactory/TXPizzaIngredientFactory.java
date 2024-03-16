package finalpizza.IngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough(){
        return new ThickDough();
    }

    public Sauce createSauce(){
        return new OMGSauce();
    }    
}
