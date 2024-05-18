package cppfooddelivery.Factory.protein;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Factory.Ingredients;

public abstract class Protein implements Ingredients {
    private String food;
    public Protein(String food){
        this.food=food;
    }
    public abstract boolean validDiets(Diet diet);
    @Override
    public String toString() {
        return food;
    }
}
