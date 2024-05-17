package cppfooddelivery.Factory;

public class Meat extends Ingredients{
    public Meat() {
        super("Meat");
    }

    @Override
    public boolean validDiets(Diet diet) {
        switch (diet){
            case Vegan:
            case Vegetarian:
            case Pescetarian:
                return false;
            default:
                return true;
        }
    }
}
