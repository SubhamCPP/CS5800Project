package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class Spinach extends FoodToppings{
    public Spinach(){
        super(null,"Vegetable");
    }

    public Spinach(Food newFood){
        super(newFood,"Vegetable");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Spinach";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
