package cppfooddelivery.Factory.fats;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Dairy extends Ingredients {
    public Dairy(){
        super("Dairy");
    }
    @Override
    public boolean validDiets(Diet diet){
        switch (diet){
            case Paleo:
            case Vegan:
            case LactoseIntolerance:
                return false;
            default:
                return true;
        }
    }
}
