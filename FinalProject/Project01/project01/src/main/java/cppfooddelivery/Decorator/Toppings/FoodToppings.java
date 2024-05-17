package cppfooddelivery.Decorator.Toppings;


import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Factory.IngredientFactory;
import cppfooddelivery.Factory.Ingredients;

public abstract class FoodToppings implements Food {
    protected Food tempFood;
    protected Ingredients ingredients;
    public FoodToppings(Food food,String ingredient){
        this.tempFood = food;
        this.ingredients= IngredientFactory.getInstance().getIngredients(ingredient);
    }
    @Override
    public Ingredients getIngredients(){
        return ingredients;
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription();
    }

    @Override
    public double getCost() {
        return tempFood.getCost();
    }
    public Food setTempFood(Food tempFood){
        this.tempFood=tempFood;
        return this;
    }
}
