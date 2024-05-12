package cppfooddelivery.meals;

public class ToppingDecorator extends MealDecorator {
    Meal meal;
    private String topping;

    public ToppingDecorator(Meal meal, String topping) {
        this.meal = meal;
        this.topping = topping;
    }

    public String getDescription() {
        return meal.getDescription() + ", with " + topping;
    }

    public double cost() {
        return meal.cost() + 1.00; // extra cost for topping
    }
}
