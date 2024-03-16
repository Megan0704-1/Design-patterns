package finalpizza.IngredientFactory.DoughFactory;

public class ThickDough implements Dough {
    private String name;
    
    public ThickDough(){
        this.name = "Thick Crust Dough";
    }

    @Override
    public String getName(){
        return this.name;
    }
}

