package cppfooddelivery.factories;

import cppfooddelivery.users.Driver;

public class DriverFactory extends UserFactory {
    @Override
    public Driver createUser(String name, String address, String county) {
        // You can provide default values or throw an UnsupportedOperationException
        throw new UnsupportedOperationException("Use createDriver method with all parameters");
    }

    public Driver createDriver(String name, String address, String county, String shift) {
        return new Driver(name, address, county, shift);
    }
}
