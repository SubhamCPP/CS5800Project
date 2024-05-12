package cppfooddelivery.factories;

import cppfooddelivery.users.*;

public class CustomerFactory extends UserFactory {
    public Customer createUser(String name, String address, String county) {
        return new Customer(name, address, county);
    }
}
