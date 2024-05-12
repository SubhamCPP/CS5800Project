package cppfooddelivery;

import cppfooddelivery.factories.*;
import cppfooddelivery.orders.*;
import cppfooddelivery.users.*;
import cppfooddelivery.meals.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CPPFoodDeliveryTest {
    private CPPFoodDelivery platform;
    private RestaurantFactory restaurantFactory;
    private DriverFactory driverFactory;
    private CustomerFactory customerFactory;

    @Before
    public void setUp() {
        platform = CPPFoodDelivery.getInstance();
        platform.clear();  // Clear the state before each test
        restaurantFactory = new RestaurantFactory();
        driverFactory = new DriverFactory();
        customerFactory = new CustomerFactory();
    }

    @Test
    public void testRestaurantRegistration() {
        Restaurant restaurant = restaurantFactory.createRestaurant("Test Restaurant", "Test Address", "Test County", "Test Cuisine", "8AM-10PM");
        platform.registerRestaurant(restaurant);

        List<Restaurant> restaurants = platform.getRestaurants();
        assertEquals(1, restaurants.size());
        assertEquals("Test Restaurant", restaurants.get(0).getName());
    }

    @Test
    public void testDriverRegistration() {
        Driver driver = driverFactory.createDriver("Test Driver", "Test Address", "Test County", "1st shift: 8AM - 4PM");
        platform.registerDriver(driver);

        List<Driver> drivers = platform.getDrivers();
        assertEquals(1, drivers.size());
        assertEquals("Test Driver", drivers.get(0).getName());
    }

    @Test
    public void testCustomerRegistration() {
        Customer customer = customerFactory.createUser("Test Customer", "Test Address", "Test County");
        platform.registerCustomer(customer);

        List<Customer> customers = platform.getCustomers();
        assertEquals(1, customers.size());
        assertEquals("Test Customer", customers.get(0).getName());
    }

    @Test
    public void testPlaceOrder() {
        // Register a restaurant
        Restaurant restaurant = restaurantFactory.createRestaurant("Test Restaurant", "Test Address", "Test County", "Test Cuisine", "8AM-10PM");
        platform.registerRestaurant(restaurant);

        // Register a driver
        Driver driver = driverFactory.createDriver("Test Driver", "Test Address", "Test County", "1st shift: 8AM - 4PM");
        platform.registerDriver(driver);

        // Register a customer
        Customer customer = customerFactory.createUser("Test Customer", "Test Address", "Test County");
        platform.registerCustomer(customer);

        // Create an order
        List<Meal> meals = new ArrayList<>();
        Meal meal = new BasicMeal("Test Meal");
        meal = new DietaryRestrictionDecorator(meal);
        meal = new ToppingDecorator(meal, "Test Topping");
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

    @Test
    public void testDriverAvailability() {
        // Register a restaurant
        Restaurant restaurant = restaurantFactory.createRestaurant("Test Restaurant", "Test Address", "Test County", "Test Cuisine", "8AM-10PM");
        platform.registerRestaurant(restaurant);

        // Register drivers
        Driver driver1 = driverFactory.createDriver("Driver 1", "Address 1", "Test County", "1st shift: 8AM - 4PM");
        Driver driver2 = driverFactory.createDriver("Driver 2", "Address 2", "Test County", "2nd shift: 4PM - 12AM");
        platform.registerDriver(driver1);
        platform.registerDriver(driver2);

        // Register a customer
        Customer customer = customerFactory.createUser("Test Customer", "Test Address", "Test County");
        platform.registerCustomer(customer);

        // Create an order during the 1st shift
        List<Meal> meals = new ArrayList<>();
        Meal meal = new BasicMeal("Test Meal");
        meal = new DietaryRestrictionDecorator(meal);
        meal = new ToppingDecorator(meal, "Test Topping");
        meals.add(meal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 10); // 10AM
        Date orderTime = calendar.getTime();

        Order order = new Order(restaurant, customer, meals, orderTime);
        platform.placeOrder(order);

        assertNotNull(order.getDriver());
        assertEquals("Driver 1", order.getDriver().getName());
    }
}
