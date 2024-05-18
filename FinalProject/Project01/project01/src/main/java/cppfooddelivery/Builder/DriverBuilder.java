package cppfooddelivery.Builder;

import cppfooddelivery.Flyweight.CustomerFlyweightFactory;
import cppfooddelivery.Flyweight.DriverFlyweightFactory;
import cppfooddelivery.users.Driver;

public class DriverBuilder {
    private String name;
    private String address;
    private String county;
    private String shift;
    public static DriverFlyweightFactory driverFlyweightFactory = new DriverFlyweightFactory();

    public DriverBuilder(){}

    public DriverBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DriverBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public DriverBuilder setCounty(String county) {
        this.county = county;
        return this;
    }

    public DriverBuilder setShift(String shift) {
        this.shift = shift;
        return this;
    }
    public Driver createDriver(){
        return driverFlyweightFactory.getDriver(name,address,county,shift);
    }
}
