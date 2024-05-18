package cppfooddelivery.Flyweight;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.users.Customer;
import cppfooddelivery.users.Driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomerFlyweightFactory {
    private final Map<Integer, Customer> customerHashTable = new HashMap<>();

    public Customer getCustomer(String name, String address, String county, Diet diet) {
        int key = Objects.hash(name, address, county, diet);
        if (!customerHashTable.containsKey(key)) {
            customerHashTable.put(key, new Customer(name, address, county, diet));
        }
        return customerHashTable.get(key);
    }
}
