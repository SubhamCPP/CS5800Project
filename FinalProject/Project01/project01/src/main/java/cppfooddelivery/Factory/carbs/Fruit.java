package cppfooddelivery.Factory.carbs;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public class Fruit extends Ingredients {
    public Fruit(){
        super("Fruit");
    }


    @Override
    public boolean validDiets(Diet diet) {
        return true;
    }
}