package cppfooddelivery.Builder;

import cppfooddelivery.users.Restaurant;

public class ResturantBuilder {
    private String name;
    private String address;
    private String county;
    private String cuisineType;
    private String operatingHours;

    public ResturantBuilder(){}

    public ResturantBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ResturantBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public ResturantBuilder setCounty(String county) {
        this.county = county;
        return this;
    }

    public ResturantBuilder setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
        return this;
    }

    public ResturantBuilder setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
        return this;
    }
    public Restaurant createRestaurant(){
        return new Restaurant(name,address,county,cuisineType,operatingHours);
    }
}
