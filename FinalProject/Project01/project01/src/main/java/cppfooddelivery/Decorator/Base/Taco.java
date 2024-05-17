package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Factory.IngredientFactory;
import cppfooddelivery.Factory.Ingredients;

public class Taco implements Food {
    @Override
    public Ingredients getIngredients() {
        return IngredientFactory.getInstance().getIngredients("Grain");
    }

    @Override
    public String getDescription() {
        return "Taco with";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
