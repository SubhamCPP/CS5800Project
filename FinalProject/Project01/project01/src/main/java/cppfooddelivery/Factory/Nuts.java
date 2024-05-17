package cppfooddelivery.Factory;

public class Nuts extends Ingredients{
    public Nuts(){
        super("Nuts");
    }
    @Override
    public boolean validDiets(Diet diet) {
        switch (diet){
            case NutAllergy:
                return false;
            default:
                return true;
        }
    }
}
