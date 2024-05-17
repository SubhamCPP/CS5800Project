package cppfooddelivery.Decorator.Toppings;


import cppfooddelivery.Decorator.Interface.Food;

public class Beef extends FoodToppings {
    public Beef(){
        super(null,"Meat");
    }

    public Beef(Food newFood){
        super(newFood,"Meat");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Beef";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
