package cppfooddelivery.Decorator.Toppings;

import cppfooddelivery.Decorator.Interface.Food;

public class BlackBean extends FoodToppings{
    public BlackBean(){
        super(null,"Beans");
    }

    public BlackBean(Food newFood){
        super(newFood,"Beans");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Black Bean";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
