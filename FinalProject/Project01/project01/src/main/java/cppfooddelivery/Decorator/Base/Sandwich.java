package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Factory.IngredientFactory;
import cppfooddelivery.Factory.Ingredients;

public class Sandwich implements Food {
    @Override
    public Ingredients getIngredients() {
        return IngredientFactory.getInstance().getIngredients("Grain");
    }
    @Override
    public String getDescription() {
        return "Sandwich with";
    }

    @Override
    public double getCost() {
        return 4;
    }
}
