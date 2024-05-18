package cppfooddelivery.Flyweight;

import cppfooddelivery.users.Driver;

import java.util.HashMap;
import java.util.Map;

public class DriverFlyweightFactory {
    private final Map<String, Driver> driverHashTable = new HashMap<>();

    public Driver getDriver(String name, String address, String county, String shift) {
        String key = name+  address + county + shift;

        if (!driverHashTable.containsKey(key)) {
            driverHashTable.put(key, new Driver(name, address, county, shift));
        }
        return driverHashTable.get(key);
    }
}
