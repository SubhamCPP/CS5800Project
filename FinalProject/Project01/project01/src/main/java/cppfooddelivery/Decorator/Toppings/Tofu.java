package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class Tofu extends FoodToppings{
    public Tofu( ){
        super(null,"Soy");
    }

    public Tofu(Food newFood){
        super(newFood,"Soy");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Tofu";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
