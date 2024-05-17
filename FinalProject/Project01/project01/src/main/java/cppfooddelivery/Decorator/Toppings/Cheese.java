package cppfooddelivery.Decorator.Toppings;


import cppfooddelivery.Decorator.Interface.Food;

public class Cheese extends FoodToppings {
    public Cheese(){
        super(null,"Dairy");
    }

    public Cheese(Food newFood){
        super(newFood,"Dairy");
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Cheese";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.50;
    }
}
