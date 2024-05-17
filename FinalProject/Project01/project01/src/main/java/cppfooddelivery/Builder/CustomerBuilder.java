package cppfooddelivery.Builder;

import cppfooddelivery.users.Customer;

public class CustomerBuilder {
    private  String name;
    private  String address;
    private  String county;
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
    public Customer createCustomer(){
        return new Customer(name,address,county);
    }
}
