package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;

public class Sandwich implements Food {
    @Override
    public String getIngredients() {
        return "Grain";
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
