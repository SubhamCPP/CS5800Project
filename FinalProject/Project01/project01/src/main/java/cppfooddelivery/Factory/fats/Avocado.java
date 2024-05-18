package cppfooddelivery.Factory.fats;

import cppfooddelivery.Factory.Diet;

public class Avocado extends Fats{
    public Avocado() {
        super("Avocado");
    }
    @Override
    public boolean validDiets(Diet diet) {
        return false;
    }
}
