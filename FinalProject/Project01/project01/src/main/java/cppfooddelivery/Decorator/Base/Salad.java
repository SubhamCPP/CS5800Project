package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Factory.IngredientFactory;
import cppfooddelivery.Factory.Ingredients;

public class Salad implements Food {

    @Override
    public Ingredients getIngredients() {
        return IngredientFactory.getInstance().getIngredients("Vegetable");
    }
    @Override
    public String getDescription() {
        return "Salad with";
    }

    @Override
    public double getCost() {
        return 6;
    }
}
