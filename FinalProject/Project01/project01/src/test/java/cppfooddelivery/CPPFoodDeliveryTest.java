package cppfooddelivery;

import cppfooddelivery.Builder.CustomerBuilder;
import cppfooddelivery.Builder.DriverBuilder;
import cppfooddelivery.Builder.ResturantBuilder;
import cppfooddelivery.Decorator.Base.Noodles;
import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Decorator.Toppings.Egg;
import cppfooddelivery.Decorator.Toppings.Peanut;
import cppfooddelivery.Factory.Diet;
import cppfooddelivery.orders.Order;
import cppfooddelivery.users.Customer;
import cppfooddelivery.users.Driver;
import cppfooddelivery.users.Restaurant;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CPPFoodDeliveryTest {
    private CPPFoodDelivery platform;

    @Before
    public void setUp() {
        platform = CPPFoodDelivery.getInstance();
        platform.clear();  // Clear the state before each test
    }

    @Test
    public void testRestaurantRegistration() {
        Restaurant restaurant = new ResturantBuilder()
                .setName("Test Restaurant")
                .setAddress("Test Address")
                .setCounty("Test County")
                .setCuisineType("Test Cuisine")
                .setOperatingHours("8AM-10PM")
                .createRestaurant();
        platform.registerRestaurant(restaurant);

        Restaurant retrievedRestaurant = platform.getRestaurants("Test Restaurant");
        assertEquals("Test Restaurant", retrievedRestaurant.getName());
    }

    @Test
    public void testDriverRegistration() {
        Driver driver = new DriverBuilder()
                .setName("Test Driver")
                .setAddress("Test Address")
                .setCounty("Test County")
                .setShift("1st shift: 8AM - 4PM")
                .createDriver();
        platform.registerDriver(driver);

        List<Driver> drivers = platform.getDrivers();
        assertEquals(1, drivers.size());
        assertEquals("Test Driver", drivers.get(0).getName());
    }

    @Test
    public void testCustomerRegistration() {
        Customer customer = new CustomerBuilder()
                .setName("Test Customer")
                .setAddress("Test Address")
                .setCounty("Test County")
                .setDiet(Diet.Vegan)
                .createCustomer();
        platform.registerCustomer(customer);

        Customer retrievedCustomer = platform.getCustomers("Test Customer");
        assertEquals("Test Customer", retrievedCustomer.getName());
    }

    @Test
    public void testPlaceOrder() {
        Restaurant restaurant = new ResturantBuilder()
                .setName("Test Restaurant")
                .setAddress("Test Address")
                .setCounty("Test County")
                .setCuisineType("Test Cuisine")
                .setOperatingHours("8AM-10PM")
                .createRestaurant();
        platform.registerRestaurant(restaurant);

        Driver driver = new DriverBuilder()
                .setName("Test Driver")
                .setAddress("Test Address")
                .setCounty("Test County")
                .setShift("1st shift: 8AM - 4PM")
                .createDriver();
        platform.registerDriver(driver);

        Customer customer = new CustomerBuilder()
                .setName("Test Customer")
                .setAddress("Test Address")
                .setCounty("Test County")
                .setDiet(Diet.Vegan)
                .createCustomer();
        platform.registerCustomer(customer);

        Noodles noodlesBase = new Noodles();
        Food meal = new Egg(noodlesBase);  // Decorate with egg
        meal = new Peanut(meal);           // Decorate with peanut

        List<Food> meals = new ArrayList<>();
        meals.add(meal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 10); // 10AM
        Date orderTime = calendar.getTime();

        Order order = new Order(restaurant, customer, meals, orderTime);
        platform.placeOrder(order);

        assertNotNull(order.getDriver());
        assertEquals("Test Driver", order.getDriver().getName());
        assertNotNull(order.getOrderPickUpTime());
        assertNotNull(order.getDeliveredTime());
    }
}
