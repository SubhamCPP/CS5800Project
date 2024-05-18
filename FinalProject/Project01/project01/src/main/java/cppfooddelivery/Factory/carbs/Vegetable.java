package cppfooddelivery.Factory.carbs;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Vegetable extends Ingredients {
    public Vegetable() {
        super("Vegetable");
    }

    @Override
    public boolean validDiets(Diet diet) {
        return true;
    }
}
