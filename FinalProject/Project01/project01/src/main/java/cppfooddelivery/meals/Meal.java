package cppfooddelivery.meals;

public abstract class Meal {
    protected String description = "Unknown Meal";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
