package cppfooddelivery.Factory.fats;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public abstract class Fats implements Ingredients {
    private String food;
    public Fats(String food){
        this.food=food;
    }
    public abstract boolean validDiets(Diet diet);
    @Override
    public String toString() {
        return food;
    }
}
