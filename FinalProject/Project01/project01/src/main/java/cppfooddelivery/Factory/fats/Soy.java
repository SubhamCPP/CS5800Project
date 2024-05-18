package cppfooddelivery.Factory.fats;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Soy extends Ingredients {
    public Soy() {
        super("Soy");
    }

    @Override
    public boolean validDiets(Diet diet) {
        return true;
    }
}
