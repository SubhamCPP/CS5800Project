package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Factory.IngredientFactory;
import cppfooddelivery.Factory.Ingredients;

public class Rice implements Food {
    @Override
    public Ingredients getIngredients() {
        return IngredientFactory.getInstance().getIngredients("Grain");
    }
    @Override
    public String getDescription() {
        return "Rice with";
    }

    @Override
    public double getCost() {
        return 3;
    }
}
