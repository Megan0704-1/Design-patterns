package finalpizza.IngredientFactory.SauceFactory;

public class MarinaraSauce implements Sauce {
    private String name;

    public MarinaraSauce(){
        this.name = "Marinara Sauce";
    }

    @Override
    public String getName(){
        return this.name;
    }
}
