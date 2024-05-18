package cppfooddelivery.Factory.protein;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Meat extends Ingredients {
    public Meat() {
        super("Meat");
    }

    @Override
    public boolean validDiets(Diet diet) {
        switch (diet){
            case Vegan:
            case Vegetarian:
            case Pescetarian:
                return false;
            default:
                return true;
        }
    }
}
