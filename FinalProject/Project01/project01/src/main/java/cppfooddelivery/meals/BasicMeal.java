package cppfooddelivery.meals;

public class BasicMeal extends Meal {
    public BasicMeal(String description) {
        this.description = description;
    }

    public double cost() {
        return 5.00; // base cost
    }
}
