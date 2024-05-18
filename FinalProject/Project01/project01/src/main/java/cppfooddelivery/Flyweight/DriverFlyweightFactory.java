package cppfooddelivery.Flyweight;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.users.Driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DriverFlyweightFactory {
    private final Map<Integer, Driver> driverHashTable = new HashMap<>();

    public Driver getDriver(String name, String address, String county, String shift) {
        int key = Objects.hash(name, address, county, shift);
        if (!driverHashTable.containsKey(key)) {
            driverHashTable.put(key, new Driver(name, address, county, shift));
        }
        return driverHashTable.get(key);
    }
}
