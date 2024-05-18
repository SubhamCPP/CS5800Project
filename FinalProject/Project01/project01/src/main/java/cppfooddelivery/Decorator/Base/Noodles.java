package cppfooddelivery.Decorator.Base;

import cppfooddelivery.Decorator.Interface.Food;

public class Noodles implements Food {

    @Override
    public String getIngredients() {
        return "Grain";
    }

    @Override
    public String getDescription() {
        return "Noodle with";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
