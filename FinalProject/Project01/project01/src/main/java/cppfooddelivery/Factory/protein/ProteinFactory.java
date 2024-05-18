package cppfooddelivery.Factory.protein;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProteinFactory {
    private static ProteinFactory instance;
    public Protein getProtein(String protein){
        switch(protein){
            case "Meat":
                return new Meat();
            case "Fish":
                return new Fish();
            case "Eggs":
                return new Eggs();
            case "Soy":
                return new Soy();
            case "Beans":
                return new Beans();
            default:
                return null;
        }
    }
    private ProteinFactory(){}
    public static ProteinFactory getInstance(){
        if(instance==null){
            instance=new ProteinFactory();
        }
        return instance;
    }
}
