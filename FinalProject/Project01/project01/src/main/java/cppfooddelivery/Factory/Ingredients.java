package cppfooddelivery.Factory;

public abstract class Ingredients {

    private String food;
    public Ingredients(String food){
        this.food=food;
    }
    public abstract boolean validDiets(Diet diet);

    @Override
    public String toString() {
        return food;
    }
}
