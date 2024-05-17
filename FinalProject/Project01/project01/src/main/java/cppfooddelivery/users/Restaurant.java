package cppfooddelivery.users;

import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Decorator.Toppings.FoodToppings;
import cppfooddelivery.Factory.Diet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant extends User {
    private String cuisineType;
    private String operatingHours;
    private Map<String, Food> menu;
    private Map<Food, List<FoodToppings>> mealTopping;

    public Restaurant(String name, String address, String county, String cuisineType, String operatingHours) {
        super(name, address, county);
        this.cuisineType = cuisineType;
        this.operatingHours = operatingHours;
        this.menu = new HashMap<>();
        this.mealTopping = new HashMap<>();
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public String getOperatingHours() {
        return operatingHours;
    }
    public void addMenu(String name,Food meal, List<FoodToppings> topping){
        this.menu.put(name,meal);
        this.mealTopping.put(meal,topping);
    }
    public Food getMeal(String meal, Diet diet,FoodToppings ... extra){
        Food mealDiet = menu.get(meal);
        for(FoodToppings top: mealTopping.get(mealDiet)){
            if(top.getIngredients().validDiets(diet)) {
                mealDiet = top.setTempFood(mealDiet);
            }
        }
        for(FoodToppings top: extra){
            if(top.getIngredients().validDiets(diet)) {
                mealDiet = top.setTempFood(mealDiet);
            }
        }
        return mealDiet;
    }
}
