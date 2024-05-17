package cppfooddelivery.Factory;

public class Fish extends Ingredients{
    public Fish() {
        super("Fish");
    }

    @Override
    public boolean validDiets(Diet diet) {
        switch (diet){
            case Vegan:
            case Vegetarian:
                return false;
            default:
                return true;
        }
    }
}
