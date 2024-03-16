package finalpizza.IngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough(){
        return new ThinDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }    
}
