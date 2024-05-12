package cppfooddelivery;

import cppfooddelivery.users.*;
import cppfooddelivery.orders.*;
import java.util.*;

public class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private List<Restaurant> restaurants = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

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
        restaurants.add(restaurant);
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
        customers.add(customer);
        System.out.println("Registered customer: " + customer.getName() +
                ", Address: " + customer.getAddress() +
                ", County: " + customer.getCounty());
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void placeOrder(Order order) {
        System.out.println("Placing order from " + order.getCustomer().getName() +
                " to " + order.getRestaurant().getName() +
                " with items: " + order.getMeals().get(0).getDescription());

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
