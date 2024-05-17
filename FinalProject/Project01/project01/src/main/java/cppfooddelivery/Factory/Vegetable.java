package cppfooddelivery.Factory;

public class Vegetable extends Ingredients{
    public Vegetable() {
        super("Vegetable");
    }

    @Override
    public boolean validDiets(Diet diet) {
        return true;
    }
}
