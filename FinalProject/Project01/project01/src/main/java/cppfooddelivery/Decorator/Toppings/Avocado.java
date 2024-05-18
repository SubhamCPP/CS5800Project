package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class Avocado extends FoodToppings{
    public Avocado( ){
        super(null,"Avocado");
    }

    public Avocado(Food newFood){
        super(newFood,"Avocado");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Avocado";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
