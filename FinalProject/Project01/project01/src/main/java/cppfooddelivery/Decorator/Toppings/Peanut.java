package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class Peanut extends FoodToppings{
    public Peanut( ){
        super(null,"Nuts");
    }

    public Peanut(Food newFood){
        super(newFood,"Nuts");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Peanut";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
