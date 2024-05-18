package cppfooddelivery.Builder;

import cppfooddelivery.Flyweight.RestaurantFlyweightFactory;
import cppfooddelivery.users.Restaurant;

public class RestaurantBuilder {
    private String name;
    private String address;
    private String county;
    private String cuisineType;
    private String operatingHours;
    private RestaurantFlyweightFactory restaurantFlyweightFactory = new RestaurantFlyweightFactory();
    public RestaurantBuilder(){}

    public RestaurantBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public RestaurantBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public RestaurantBuilder setCounty(String county) {
        this.county = county;
        return this;
    }

    public RestaurantBuilder setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
        return this;
    }

    public RestaurantBuilder setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
        return this;
    }
    public Restaurant createRestaurant(){
        return restaurantFlyweightFactory.getRestaurant(name,address,county,cuisineType,operatingHours);
    }
}
