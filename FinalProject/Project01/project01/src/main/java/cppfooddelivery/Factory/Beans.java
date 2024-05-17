package cppfooddelivery.Factory;

public class Beans extends Ingredients {
    public Beans(){
        super("Beans");
    }
    @Override
    public boolean validDiets(Diet diet){
        switch (diet){
            case Paleo:
                return false;
            default:
                return true;
        }
    }
}
