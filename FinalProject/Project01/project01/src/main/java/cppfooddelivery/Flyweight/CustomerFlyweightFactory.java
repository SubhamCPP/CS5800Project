package cppfooddelivery.Flyweight;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.users.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerFlyweightFactory {
    private final Map<String, Customer> customerHashTable = new HashMap<>();

    public Customer getCustomer(String name, String address, String county, Diet diet) {
        String key = name + address + county + diet;

        if (!customerHashTable.containsKey(key)) {
            Customer newCustomer = new Customer(name, address, county, diet);
            customerHashTable.put(key, newCustomer);
        }
        return customerHashTable.get(key);
    }
}
