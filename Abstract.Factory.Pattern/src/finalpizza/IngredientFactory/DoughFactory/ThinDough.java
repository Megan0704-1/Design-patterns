package finalpizza.IngredientFactory.DoughFactory;

public class ThinDough implements Dough {
    private String name;
    
    public ThinDough(){
        this.name = "Thin Crust Dough";
    }

    @Override
    public String getName(){
        return this.name;
    }
}

