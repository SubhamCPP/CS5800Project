package cppfooddelivery.Builder;

import cppfooddelivery.Factory.Diet;
import cppfooddelivery.Flyweight.CustomerFlyweightFactory;
import cppfooddelivery.users.Customer;


public class CustomerBuilder {
    private  String name;
    private  String address;
    private  String county;
    private Diet diet;
    public static CustomerFlyweightFactory customerFlyweightFactory = new CustomerFlyweightFactory();
    public CustomerBuilder(){}

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setCounty(String county) {
        this.county = county;
        return this;
    }
    public CustomerBuilder setDiet(Diet diet) {
        this.diet = diet;
        return this;
    }
    public Customer createCustomer(){
        return customerFlyweightFactory.getCustomer(name,address,county,diet);
    }
}
