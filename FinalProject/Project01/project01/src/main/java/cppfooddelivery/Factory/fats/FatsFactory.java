package cppfooddelivery.Factory.fats;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FatsFactory {
    private static FatsFactory instance;
    public Fats getFats(String fat){
        switch(fat){
            case "Avocado":
                return new Avocado();
            case "Nuts":
                return new Nuts();
            case "Dairy":
                return new Dairy();
            default:
                return null;
        }
    }
    private FatsFactory(){}
    public static FatsFactory getInstance(){
        if(instance==null){
            instance=new FatsFactory();
        }
        return instance;
    }
}
