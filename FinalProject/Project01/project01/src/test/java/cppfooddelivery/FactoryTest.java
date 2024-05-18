package cppfooddelivery;
import cppfooddelivery.Factory.carbs.*;
import cppfooddelivery.Factory.fats.*;
import cppfooddelivery.Factory.protein.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    public void CarbsFactoryTest() {
        CarbsFactory carbsFac = CarbsFactory.getInstance();
        Carbs grain = carbsFac.getCarbs("Grain");
        assertTrue(grain instanceof Grain);

        Carbs fruit = carbsFac.getCarbs("Fruit");
        assertTrue(fruit instanceof Fruit);

        Carbs vegetable = carbsFac.getCarbs("Vegetable");
        assertTrue(vegetable instanceof Vegetable);
    }
    @Test
    public void ProteinFactoryTest() {
        ProteinFactory proteinFactory = ProteinFactory.getInstance();
        Protein bean = proteinFactory.getProtein("Beans");
        assertTrue(bean instanceof Beans);

        Protein eggs = proteinFactory.getProtein("Eggs");
        assertTrue(eggs instanceof Eggs);

        Protein fish = proteinFactory.getProtein("Fish");
        assertTrue(fish instanceof Fish);

        Protein meat = proteinFactory.getProtein("Meat");
        assertTrue(meat instanceof Meat);

        Protein soy = proteinFactory.getProtein("Soy");
        assertTrue(soy instanceof Soy);
    }
    @Test
    public void FatFactoryTest() {
        FatsFactory fatFac = FatsFactory.getInstance();
        Fats avocado = fatFac.getFats("Avocado");
        assertTrue(avocado instanceof Avocado);

        Fats dairy = fatFac.getFats("Dairy");
        assertTrue(dairy instanceof Dairy);

        Fats nuts = fatFac.getFats("Nuts");
        assertTrue(nuts instanceof Nuts);

    }
}
