package cppfooddelivery.Factory.protein;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Fish extends Protein {
    public Fish() {
        super("Fish");
    }

    @Override
    public boolean validDiets(Diet diet) {
        switch (diet){
            case Vegan:
            case Vegetarian:
                return false;
            default:
                return true;
        }
    }
}
