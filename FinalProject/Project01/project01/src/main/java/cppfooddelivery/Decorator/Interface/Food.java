package cppfooddelivery.Decorator.Interface;

import cppfooddelivery.Factory.Ingredients;

public interface Food {
    public Ingredients getIngredients();
    public String getDescription();
    public double getCost();
}
