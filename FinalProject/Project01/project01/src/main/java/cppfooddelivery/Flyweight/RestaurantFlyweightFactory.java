package cppfooddelivery.Flyweight;


import cppfooddelivery.users.Restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RestaurantFlyweightFactory {
    private final Map<String, Restaurant> restaurantHashMap = new HashMap<>();

    public Restaurant getRestaurant(String name, String address, String county, String cuisineType, String operatingHours) {
        String key = name + address + county + cuisineType + operatingHours;

        if (!restaurantHashMap.containsKey(key)) {
            restaurantHashMap.put(key, new Restaurant(name,address,county,cuisineType,operatingHours));
        }
        return restaurantHashMap.get(key);
    }
}
