package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;

public class NoBase implements Food {
    @Override
    public String getIngredients() {
        return "";
    }
    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
