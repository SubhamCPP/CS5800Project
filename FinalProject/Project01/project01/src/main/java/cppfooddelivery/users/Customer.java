package cppfooddelivery.users;

import cppfooddelivery.Factory.Diet;

public class Customer extends User {
    private Diet diet;
    public Customer(String name, String address, String county,Diet diet) {
        super(name, address, county);
        this.diet=diet;
    }

    public Diet getDiet() {
        return diet;
    }
}
