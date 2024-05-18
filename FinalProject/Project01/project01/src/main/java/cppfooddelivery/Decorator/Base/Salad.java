package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;

public class Salad implements Food {

    @Override
    public String getIngredients() {
        return "Vegetable";
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
