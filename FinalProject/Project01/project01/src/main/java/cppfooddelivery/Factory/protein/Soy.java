package cppfooddelivery.Factory.protein;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Soy extends Protein {
    public Soy() {
        super("Soy");
    }

    @Override
    public boolean validDiets(Diet diet) {
        return true;
    }
}
