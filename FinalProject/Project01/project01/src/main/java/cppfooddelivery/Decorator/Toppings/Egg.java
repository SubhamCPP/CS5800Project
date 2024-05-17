package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class Egg extends FoodToppings{
    public Egg( ){
        super(null,"Eggs");
    }

    public Egg(Food newFood){
        super(newFood,"Eggs");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Egg";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
