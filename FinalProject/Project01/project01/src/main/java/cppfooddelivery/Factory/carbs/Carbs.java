package cppfooddelivery.Factory.carbs;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public abstract class Carbs implements Ingredients {
    private String food;
    public Carbs(String food){
        this.food=food;
    }
    public abstract boolean validDiets(Diet diet);

    @Override
    public String toString() {
        return food;
    }
}
