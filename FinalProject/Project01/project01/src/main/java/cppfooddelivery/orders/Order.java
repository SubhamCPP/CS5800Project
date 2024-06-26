package cppfooddelivery.orders;

import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.users.*;
import java.util.*;

public class Order {
    private Restaurant restaurant;
    private Customer customer;
    private List<Food> meals;
    private Driver driver;
    private Date orderCreationTime;
    private Date orderPickUpTime;
    private Date deliveredTime;

    public Order(Restaurant restaurant, Customer customer, List<Food> meals, Date orderCreationTime) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.meals = meals;
        this.orderCreationTime = orderCreationTime;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Food> getMeals() {
        return meals;
    }

    public Date getOrderCreationTime() {
        return orderCreationTime;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Date getOrderPickUpTime() {
        return orderPickUpTime;
    }

    public void setOrderPickUpTime(Date orderPickUpTime) {
        this.orderPickUpTime = orderPickUpTime;
    }

    public Date getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }
}
