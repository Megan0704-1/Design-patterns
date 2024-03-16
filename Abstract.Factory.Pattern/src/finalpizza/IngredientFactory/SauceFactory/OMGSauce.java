package finalpizza.IngredientFactory.SauceFactory;

public class OMGSauce implements Sauce {
    private String name;

    public OMGSauce(){
        this.name = "OMG Sauce";
    }

    @Override
    public String getName(){
        return this.name;
    }
}
