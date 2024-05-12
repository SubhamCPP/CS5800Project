package cppfooddelivery.factories;

import cppfooddelivery.users.*;

public abstract class UserFactory {
    public abstract User createUser(String name, String address, String county);
}
