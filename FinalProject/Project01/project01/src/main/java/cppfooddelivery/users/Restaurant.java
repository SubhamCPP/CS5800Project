package cppfooddelivery.users;

public class Restaurant extends User {
    private String cuisineType;
    private String operatingHours;

    public Restaurant(String name, String address, String county, String cuisineType, String operatingHours) {
        super(name, address, county);
        this.cuisineType = cuisineType;
        this.operatingHours = operatingHours;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public String getOperatingHours() {
        return operatingHours;
    }
}
