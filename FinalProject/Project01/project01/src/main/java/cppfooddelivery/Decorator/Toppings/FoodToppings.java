package cppfooddelivery.Decorator.Toppings;


import cppfooddelivery.Decorator.Interface.Food;

public abstract class FoodToppings implements Food {
    protected Food tempFood;
    protected String ingredients;
    public FoodToppings(Food food,String ingredient){
        this.tempFood = food;
        this.ingredients= ingredient;
    }
    @Override
    public String getIngredients(){
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
