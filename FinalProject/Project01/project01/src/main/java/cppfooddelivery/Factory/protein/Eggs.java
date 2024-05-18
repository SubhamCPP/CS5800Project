package cppfooddelivery.Factory.protein;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Eggs extends Protein {
    public Eggs() {
        super("Eggs");
    }

    @Override
    public boolean validDiets(Diet diet) {
        switch (diet){
            case Vegan:
                return false;
            default:
                return true;
        }
    }
}
