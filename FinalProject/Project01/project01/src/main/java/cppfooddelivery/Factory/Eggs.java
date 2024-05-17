package cppfooddelivery.Factory;

public class Eggs extends Ingredients{
    public Eggs() {
        super("Eggs");
    }

    @Override
    public boolean validDiets(Diet diet) {
        switch (diet){
            case Vegan:
                return false;
            default:
                return true;
        }
    }
}
