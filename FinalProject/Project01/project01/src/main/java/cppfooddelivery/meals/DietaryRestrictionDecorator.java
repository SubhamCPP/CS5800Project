package cppfooddelivery.meals;

public class DietaryRestrictionDecorator extends MealDecorator {
    Meal meal;

    public DietaryRestrictionDecorator(Meal meal) {
        this.meal = meal;
    }

    public String getDescription() {
        return meal.getDescription() + ", with dietary restriction";
    }

    public double cost() {
        return meal.cost() + 2.00; // extra cost for dietary restriction
    }
}
