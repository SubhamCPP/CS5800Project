package cppfooddelivery.Factory;

import cppfooddelivery.Factory.carbs.Fruit;
import cppfooddelivery.Factory.carbs.Grain;
import cppfooddelivery.Factory.carbs.Vegetable;
import cppfooddelivery.Factory.fats.Dairy;
import cppfooddelivery.Factory.fats.Nuts;
import cppfooddelivery.Factory.fats.Soy;
import cppfooddelivery.Factory.protein.Beans;
import cppfooddelivery.Factory.protein.Eggs;
import cppfooddelivery.Factory.protein.Fish;
import cppfooddelivery.Factory.protein.Meat;

public class IngredientFactory {
    private static IngredientFactory instance;
    public Ingredients getIngredients(String ingredient){
        switch(ingredient){
            case "Beans":
                return new Beans();
            case "Meat":
                return new Meat();
            case "Dairy":
                return new Dairy();
            case "Eggs":
                return new Eggs();
            case "Fish":
                return new Fish();
            case "Fruit":
                return new Fruit();
            case "Grain":
                return new Grain();
            case "Nuts":
                return new Nuts();
            case "Soy":
                return new Soy();
            case "Vegetable":
                return new Vegetable();
            default:
                return null;
        }
    }
    private IngredientFactory(){}

    public static IngredientFactory getInstance(){
        if(instance==null){
            instance=new IngredientFactory();
        }
        return instance;
    }
}
