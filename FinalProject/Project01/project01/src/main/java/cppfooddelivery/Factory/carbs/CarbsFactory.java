package cppfooddelivery.Factory.carbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarbsFactory {
    private static CarbsFactory instance;
    public Carbs getCarbs(String carb){
        switch(carb){
            case "Grain":
                return new Grain();
            case "Fruit":
                return new Fruit();
            case "Vegetable":
                return new Vegetable();
            default:
                return null;
        }
    }
    private CarbsFactory(){}

    public static CarbsFactory getInstance(){
        if(instance==null){
            instance=new CarbsFactory();
        }
        return instance;
    }


}
