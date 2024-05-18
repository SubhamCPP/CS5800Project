package cppfooddelivery.Factory.carbs;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Grain extends Ingredients {
    public Grain(){
        super("Grain");
    }
    @Override
    public boolean validDiets(Diet diet){
        switch (diet){
            case Paleo:
                return false;
            default:
                return true;
        }
    }

}