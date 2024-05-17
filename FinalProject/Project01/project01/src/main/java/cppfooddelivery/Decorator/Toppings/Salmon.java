package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class Salmon extends FoodToppings{
    public Salmon( ){
        super(null,"Fish");
    }

    public Salmon(Food newFood){
        super(newFood,"Fish");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Salmon";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
