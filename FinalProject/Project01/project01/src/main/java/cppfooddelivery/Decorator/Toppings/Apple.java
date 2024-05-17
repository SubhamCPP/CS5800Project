package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class Apple extends FoodToppings{

    public Apple(){
        super(null,"Fruit");
    }
    public Apple(Food newFood){
        super(newFood,"Fruit");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Apple";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
