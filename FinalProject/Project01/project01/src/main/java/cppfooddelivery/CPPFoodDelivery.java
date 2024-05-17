package cppfooddelivery;

import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.users.*;
import cppfooddelivery.orders.*;
import java.util.*;

public class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private Map<String,Restaurant> restaurants = new HashMap<>();
    private List<Driver> drivers = new ArrayList<>();
    private Map<String,Customer> customers = new HashMap<>();

    private CPPFoodDelivery() {}

    public static CPPFoodDelivery getInstance() {
        if (instance == null) {
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public void clear() {
        restaurants.clear();
        drivers.clear();
        customers.clear();
    }

    public void registerRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getName(),restaurant);
        System.out.println("Registered restaurant: " + restaurant.getName() +
                ", Address: " + restaurant.getAddress() +
                ", County: " + restaurant.getCounty() +
                ", Cuisine: " + restaurant.getCuisineType() +
                ", Operating Hours: " + restaurant.getOperatingHours());
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Registered driver: " + driver.getName() +
                ", Address: " + driver.getAddress() +
                ", County: " + driver.getCounty() +
                ", Shift: " + driver.getShift());
    }

    public void registerCustomer(Customer customer) {
        customers.put(customer.getName(),customer);
        System.out.println("Registered customer: " + customer.getName() +
                ", Address: " + customer.getAddress() +
                ", County: " + customer.getCounty());
    }

    public Restaurant getRestaurants(String name) {
        return restaurants.get(name);
    }


    public List<Driver> getDrivers() {
        return drivers;
    }

    public Customer getCustomers(String name) {
        return customers.get(name);
    }

    public void placeOrder(Order order) {
        System.out.print("Placing order from " + order.getCustomer().getName() +
                " with a "+ order.getCustomer().getDiet()+" diet to " + order.getRestaurant().getName() +
                " with items: ");
        for(Food food:  order.getMeals()){
            System.out.print(food.getDescription());
            System.out.print(", ");

        }
        System.out.println();

        boolean orderPlaced = false;
        for (Driver driver : drivers) {
            Date orderPickUpTime = new Date(order.getOrderCreationTime().getTime()); // Use order creation time as base

            // Adding a buffer of 15 minutes to the order pick up time for delivery
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(orderPickUpTime);
            calendar.add(Calendar.MINUTE, 15); // Add 15 minutes
            Date deliveredTime = calendar.getTime();

            if (driver.isAvailable(order.getOrderCreationTime(), order.getRestaurant().getCounty(), deliveredTime)) {
                System.out.println("Driver " + driver.getName() + " is delivering the order.");
                order.setDriver(driver);

                order.setOrderPickUpTime(orderPickUpTime);
                order.setDeliveredTime(deliveredTime);

                driver.addDelivery(orderPickUpTime, deliveredTime);

                System.out.println("Driver " + driver.getName() +
                        " is delivering the order from " + order.getRestaurant().getName() +
                        " to " + order.getCustomer().getName());
                System.out.println("Order picked up at " + order.getOrderPickUpTime() +
                        " and delivered at " + order.getDeliveredTime());
                orderPlaced = true;
                break;
            }
        }
        if (!orderPlaced) {
            System.out.println("No available driver for the order from " + order.getCustomer().getName() +
                    " to " + order.getRestaurant().getName());
        }
    }
}
