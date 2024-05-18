package cppfooddelivery.Factory;

import cppfooddelivery.Factory.carbs.Carbs;
import cppfooddelivery.Factory.carbs.CarbsFactory;
import cppfooddelivery.Factory.fats.Fats;
import cppfooddelivery.Factory.fats.FatsFactory;
import cppfooddelivery.Factory.protein.Protein;
import cppfooddelivery.Factory.protein.ProteinFactory;

public class IngredientFactory {
    private static IngredientFactory instance;
    private Ingredients ingredient;
    private IngredientFactory(){}
    public static IngredientFactory getInstance() {
        if(instance==null)
        {
            instance=new IngredientFactory();
        }
        return instance;
    }

    public void setIngredient(String ingredient){
        Carbs tempCarb = CarbsFactory.getInstance().getCarbs(ingredient);
        Fats tempFats = FatsFactory.getInstance().getFats(ingredient);
        Protein tempProtein = ProteinFactory.getInstance().getProtein(ingredient);
        if(tempCarb != null){
            this.ingredient=tempCarb;
        }
        if(tempFats != null){
            this.ingredient=tempFats;
        }
        if(tempProtein != null){
            this.ingredient=tempProtein;
        }
    }
    public boolean checkDiet(Diet diet){
        switch (diet){
            case NoFats:
                return (ingredient instanceof Fats ? false : ingredient.validDiets(diet));
            case NoCarbs:
                return (ingredient instanceof Carbs ? false : ingredient.validDiets(diet));
            case NoProtein:
                return (ingredient instanceof Protein ? false : ingredient.validDiets(diet));
            default:
                return ingredient.validDiets(diet);
        }
    }
    public boolean setAndCheckIngridient(String ingredient,Diet diet){
        this.setIngredient(ingredient);
        return checkDiet(diet);
    }
}