package cppfooddelivery;

import cppfooddelivery.factories.*;
import cppfooddelivery.orders.*;
import cppfooddelivery.users.*;
import cppfooddelivery.meals.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery platform = CPPFoodDelivery.getInstance();

        System.out.println("=========================================================================================");
        // Register Restaurants
        RestaurantFactory restaurantFactory = new RestaurantFactory();
        platform.registerRestaurant(restaurantFactory.createRestaurant("Restaurant 1", "Address 1", "LA County", "Mexican", "8AM-10PM"));
        platform.registerRestaurant(restaurantFactory.createRestaurant("Restaurant 2", "Address 2", "Orange County", "Thai", "9AM-9PM"));
        platform.registerRestaurant(restaurantFactory.createRestaurant("Restaurant 3", "Address 3", "San Bernardino County", "Italian", "10AM-11PM"));
        platform.registerRestaurant(restaurantFactory.createRestaurant("Restaurant 4", "Address 4", "LA County", "Chinese", "11AM-12AM"));

        System.out.println("=========================================================================================");
        // Register Drivers
        DriverFactory driverFactory = new DriverFactory();
        platform.registerDriver(driverFactory.createDriver("Driver 1", "Address 1", "LA County", "1st shift: 8AM - 4PM"));
        platform.registerDriver(driverFactory.createDriver("Driver 2", "Address 2", "Orange County", "2nd shift: 4PM - 12AM"));
        platform.registerDriver(driverFactory.createDriver("Driver 3", "Address 3", "San Bernardino County", "3rd shift: 12AM - 8AM"));
        platform.registerDriver(driverFactory.createDriver("Driver 4", "Address 4", "LA County", "1st shift: 8AM - 4PM"));
        platform.registerDriver(driverFactory.createDriver("Driver 5", "Address 5", "Orange County", "2nd shift: 4PM - 12AM"));
        platform.registerDriver(driverFactory.createDriver("Driver 6", "Address 6", "San Bernardino County", "3rd shift: 12AM - 8AM"));
        platform.registerDriver(driverFactory.createDriver("Driver 7", "Address 7", "LA County", "1st shift: 8AM - 4PM"));
        platform.registerDriver(driverFactory.createDriver("Driver 8", "Address 8", "Orange County", "2nd shift: 4PM - 12AM"));

        System.out.println("=========================================================================================");
        // Register Customers
        CustomerFactory customerFactory = new CustomerFactory();
        platform.registerCustomer(customerFactory.createUser("Customer 1", "Address 1", "LA County"));
        platform.registerCustomer(customerFactory.createUser("Customer 2", "Address 2", "Orange County"));
        platform.registerCustomer(customerFactory.createUser("Customer 3", "Address 3", "San Bernardino County"));
        platform.registerCustomer(customerFactory.createUser("Customer 4", "Address 4", "LA County"));
        platform.registerCustomer(customerFactory.createUser("Customer 5", "Address 5", "Orange County"));
        platform.registerCustomer(customerFactory.createUser("Customer 6", "Address 6", "San Bernardino County"));
        platform.registerCustomer(customerFactory.createUser("Customer 7", "Address 7", "LA County"));
        platform.registerCustomer(customerFactory.createUser("Customer 8", "Address 8", "Orange County"));
        platform.registerCustomer(customerFactory.createUser("Customer 9", "Address 9", "San Bernardino County"));
        platform.registerCustomer(customerFactory.createUser("Customer 10", "Address 10", "LA County"));

        System.out.println("=========================================================================================");
        // Place multiple orders

        // Order 1 - Time within 1st shift (8AM - 4PM)
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.HOUR_OF_DAY, 10); // 10AM
        calendar1.set(Calendar.MINUTE, 0);
        Date orderTime1 = calendar1.getTime();

        List<Meal> meals1 = new ArrayList<>();
        Meal meal1 = new BasicMeal("Burrito");
        meal1 = new DietaryRestrictionDecorator(meal1);
        meal1 = new ToppingDecorator(meal1, "Extra Cheese");
        meals1.add(meal1);

        Order order1 = new Order(platform.getRestaurants().get(0), platform.getCustomers().get(0), meals1, orderTime1);
        platform.placeOrder(order1);

        System.out.println("=========================================================================================");
        // Order 2 - Time within 2nd shift (4PM - 12AM)
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY, 18); // 6PM
        calendar2.set(Calendar.MINUTE, 5);
        Date orderTime2 = calendar2.getTime();

        List<Meal> meals2 = new ArrayList<>();
        Meal meal2 = new BasicMeal("Pad Thai");
        meal2 = new DietaryRestrictionDecorator(meal2);
        meal2 = new ToppingDecorator(meal2, "Peanuts");
        meals2.add(meal2);

        Order order2 = new Order(platform.getRestaurants().get(1), platform.getCustomers().get(1), meals2, orderTime2);
        platform.placeOrder(order2);

        System.out.println("=========================================================================================");
        // Order 3 - Time within 3rd shift (12AM - 8AM)
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.HOUR_OF_DAY, 2); // 2AM
        calendar3.set(Calendar.MINUTE, 10);
        Date orderTime3 = calendar3.getTime();

        List<Meal> meals3 = new ArrayList<>();
        Meal meal3 = new BasicMeal("Pizza");
        meal3 = new DietaryRestrictionDecorator(meal3);
        meal3 = new ToppingDecorator(meal3, "Olives");
        meals3.add(meal3);

        Order order3 = new Order(platform.getRestaurants().get(2), platform.getCustomers().get(2), meals3, orderTime3);
        platform.placeOrder(order3);

        System.out.println("=========================================================================================");
        // Order 4 - Time within 1st shift (8AM - 4PM)
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(Calendar.HOUR_OF_DAY, 14); // 2PM
        calendar4.set(Calendar.MINUTE, 15);
        Date orderTime4 = calendar4.getTime();

        List<Meal> meals4 = new ArrayList<>();
        Meal meal4 = new BasicMeal("Kung Pao Chicken");
        meal4 = new DietaryRestrictionDecorator(meal4);
        meal4 = new ToppingDecorator(meal4, "Cashews");
        meals4.add(meal4);

        Order order4 = new Order(platform.getRestaurants().get(3), platform.getCustomers().get(3), meals4, orderTime4);
        platform.placeOrder(order4);

        System.out.println("=========================================================================================");
        // Order 5 - Time within 1st shift (8AM - 4PM)
        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(Calendar.HOUR_OF_DAY, 11); // 11AM
        calendar5.set(Calendar.MINUTE, 20);
        Date orderTime5 = calendar5.getTime();

        List<Meal> meals5 = new ArrayList<>();
        Meal meal5 = new BasicMeal("Tacos");
        meal5 = new DietaryRestrictionDecorator(meal5);
        meal5 = new ToppingDecorator(meal5, "Sour Cream");
        meals5.add(meal5);

        Order order5 = new Order(platform.getRestaurants().get(0), platform.getCustomers().get(4), meals5, orderTime5);
        platform.placeOrder(order5);

        System.out.println("=========================================================================================");
        // Order 6 - Time within 2nd shift (4PM - 12AM)
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(Calendar.HOUR_OF_DAY, 19); // 7PM
        calendar6.set(Calendar.MINUTE, 25);
        Date orderTime6 = calendar6.getTime();

        List<Meal> meals6 = new ArrayList<>();
        Meal meal6 = new BasicMeal("Green Curry");
        meal6 = new DietaryRestrictionDecorator(meal6);
        meal6 = new ToppingDecorator(meal6, "Extra Spicy");
        meals6.add(meal6);

        Order order6 = new Order(platform.getRestaurants().get(1), platform.getCustomers().get(5), meals6, orderTime6);
        platform.placeOrder(order6);

        System.out.println("=========================================================================================");
        // Order 7 - Time within 3rd shift (12AM - 8AM)
        Calendar calendar7 = Calendar.getInstance();
        calendar7.set(Calendar.HOUR_OF_DAY, 3); // 3AM
        calendar7.set(Calendar.MINUTE, 30);
        Date orderTime7 = calendar7.getTime();

        List<Meal> meals7 = new ArrayList<>();
        Meal meal7 = new BasicMeal("Spaghetti");
        meal7 = new DietaryRestrictionDecorator(meal7);
        meal7 = new ToppingDecorator(meal7, "Parmesan");
        meals7.add(meal7);

        Order order7 = new Order(platform.getRestaurants().get(2), platform.getCustomers().get(6), meals7, orderTime7);
        platform.placeOrder(order7);

        System.out.println("=========================================================================================");
        // Order 8 - Time within 1st shift (8AM - 4PM)
        Calendar calendar8 = Calendar.getInstance();
        calendar8.set(Calendar.HOUR_OF_DAY, 9); // 9AM
        calendar8.set(Calendar.MINUTE, 35);
        Date orderTime8 = calendar8.getTime();

        List<Meal> meals8 = new ArrayList<>();
        Meal meal8 = new BasicMeal("Chow Mein");
        meal8 = new DietaryRestrictionDecorator(meal8);
        meal8 = new ToppingDecorator(meal8, "Extra Veggies");
        meals8.add(meal8);

        Order order8 = new Order(platform.getRestaurants().get(3), platform.getCustomers().get(7), meals8, orderTime8);
        platform.placeOrder(order8);

        System.out.println("=========================================================================================");
        // Order 9 - Time within 2nd shift (4PM - 12AM)
        Calendar calendar9 = Calendar.getInstance();
        calendar9.set(Calendar.HOUR_OF_DAY, 20); // 8PM
        calendar9.set(Calendar.MINUTE, 40);
        Date orderTime9 = calendar9.getTime();

        List<Meal> meals9 = new ArrayList<>();
        Meal meal9 = new BasicMeal("Spring Rolls");
        meal9 = new DietaryRestrictionDecorator(meal9);
        meal9 = new ToppingDecorator(meal9, "Peanut Sauce");
        meals9.add(meal9);

        Order order9 = new Order(platform.getRestaurants().get(1), platform.getCustomers().get(8), meals9, orderTime9);
        platform.placeOrder(order9);

        System.out.println("=========================================================================================");
        // Order 10 - Time within 3rd shift (12AM - 8AM)
        Calendar calendar10 = Calendar.getInstance();
        calendar10.set(Calendar.HOUR_OF_DAY, 4); // 4AM
        calendar10.set(Calendar.MINUTE, 45);
        Date orderTime10 = calendar10.getTime();

        List<Meal> meals10 = new ArrayList<>();
        Meal meal10 = new BasicMeal("Lasagna");
        meal10 = new DietaryRestrictionDecorator(meal10);
        meal10 = new ToppingDecorator(meal10, "Garlic Bread");
        meals10.add(meal10);

        Order order10 = new Order(platform.getRestaurants().get(2), platform.getCustomers().get(9), meals10, orderTime10);
        platform.placeOrder(order10);

        System.out.println("=========================================================================================");
    }
}
