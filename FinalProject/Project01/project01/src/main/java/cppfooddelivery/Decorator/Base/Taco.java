package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;

public class Taco implements Food {
    @Override
    public String getIngredients() {
        return "Grain";
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
