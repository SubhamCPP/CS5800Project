package cppfooddelivery.factories;

import cppfooddelivery.users.Restaurant;

public class RestaurantFactory extends UserFactory {
    @Override
    public Restaurant createUser(String name, String address, String county) {
        // You can provide default values or throw an UnsupportedOperationException
        throw new UnsupportedOperationException("Use createRestaurant method with all parameters");
    }

    public Restaurant createRestaurant(String name, String address, String county, String cuisineType, String operatingHours) {
        return new Restaurant(name, address, county, cuisineType, operatingHours);
    }
}
