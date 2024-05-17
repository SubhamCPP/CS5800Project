package cppfooddelivery.Factory;

public class Soy extends Ingredients{
    public Soy() {
        super("Soy");
    }

    @Override
    public boolean validDiets(Diet diet) {
        return true;
    }
}
