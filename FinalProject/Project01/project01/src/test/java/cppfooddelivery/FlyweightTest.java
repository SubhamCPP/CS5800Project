package cppfooddelivery;

import cppfooddelivery.Builder.CustomerBuilder;
import cppfooddelivery.Builder.DriverBuilder;
import cppfooddelivery.Builder.RestaurantBuilder;
import cppfooddelivery.Factory.Diet;
import cppfooddelivery.users.Customer;
import cppfooddelivery.users.Driver;
import cppfooddelivery.users.Restaurant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {
    @Test
    public void CustomerFlyweightTest() {
        Customer test = new CustomerBuilder().setName("Alice Johnson").setAddress("123 Dragon Street").setCounty("LA County").setDiet(Diet.Vegan).createCustomer();
        Customer test1 = new CustomerBuilder().setName("Alice Johnson").setAddress("123 Dragon Street").setCounty("LA County").setDiet(Diet.Vegan).createCustomer();
        assertEquals(test, test1);
    }
    @Test
    public void DriverFlyweightTest() {
        Driver test = new DriverBuilder().setName("James Smith").setAddress("123 Dragon Street").setCounty("LA County").setShift("1st shift: 8AM - 4PM").createDriver();
        Driver test1 = new DriverBuilder().setName("James Smith").setAddress("123 Dragon Street").setCounty("LA County").setShift("1st shift: 8AM - 4PM").createDriver();
        assertEquals(test, test1);
    }
    @Test
    public void RestaurantFlyweightTest() {
        Restaurant test = new RestaurantBuilder().setCounty("LA County").setAddress("101 American Blvd").setName("Salad Barn").setCuisineType("American").setOperatingHours("11AM-12AM").createRestaurant();
        Restaurant test1 = new  RestaurantBuilder().setCounty("LA County").setAddress("101 American Blvd").setName("Salad Barn").setCuisineType("American").setOperatingHours("11AM-12AM").createRestaurant();
        assertEquals(test, test1);
    }
}
