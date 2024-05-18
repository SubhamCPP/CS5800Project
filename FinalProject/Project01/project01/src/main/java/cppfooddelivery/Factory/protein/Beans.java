package cppfooddelivery.Factory.protein;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Beans extends Protein {
    public Beans(){
        super("Beans");
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
