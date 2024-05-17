package cppfooddelivery;

import cppfooddelivery.Builder.CustomerBuilder;
import cppfooddelivery.Builder.DriverBuilder;
import cppfooddelivery.Builder.ResturantBuilder;
import cppfooddelivery.Decorator.Base.*;
import cppfooddelivery.Decorator.Interface.Food;
import cppfooddelivery.Decorator.Toppings.*;
import cppfooddelivery.Factory.Diet;
import cppfooddelivery.orders.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery platform = CPPFoodDelivery.getInstance();

        System.out.println("=========================================================================================");
        // Register Restaurants
        platform.registerRestaurant(new ResturantBuilder().setCounty("LA County").setAddress("123 Dragon Street").setName("Golden Dragon").setCuisineType("Chinese").setOperatingHours("8AM-10PM").createRestaurant());
        platform.getRestaurants("Golden Dragon").addMenu("Fish Noodle",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Salmon())));
        platform.getRestaurants("Golden Dragon").addMenu("Beef Noodle",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Beef())));
        platform.getRestaurants("Golden Dragon").addMenu("Tofu Noodle",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Tofu())));
        platform.getRestaurants("Golden Dragon").addMenu("Cheese Noodle",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Cheese())));

        platform.registerRestaurant(new ResturantBuilder().setCounty("Orange County").setAddress("456 Taco Way").setName("Taco Fiesta").setCuisineType("Mexican").setOperatingHours("9AM-9PM").createRestaurant());
        platform.getRestaurants("Taco Fiesta").addMenu("Fish Taco",new Taco(),new ArrayList<FoodToppings>(List.of(new Cheese(),new BlackBean(),new Salmon())));
        platform.getRestaurants("Taco Fiesta").addMenu("Beef Taco",new Taco(),new ArrayList<FoodToppings>(List.of(new Cheese(),new BlackBean(),new Beef())));
        platform.getRestaurants("Taco Fiesta").addMenu("Tofu Taco",new Taco(),new ArrayList<FoodToppings>(List.of(new Cheese(),new BlackBean(),new Tofu())));
        platform.getRestaurants("Taco Fiesta").addMenu("BlackBean Taco",new Taco(),new ArrayList<FoodToppings>(List.of(new Cheese())));

        platform.registerRestaurant(new ResturantBuilder().setCounty("San Bernardino County").setAddress("789 Sandwich Place").setCuisineType("Thai").setName("Sandwich Palace").setCuisineType("Italian").setOperatingHours("10AM-11PM").createRestaurant());
        platform.getRestaurants("Sandwich Palace").addMenu("Fish Sandwich",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Cheese(),new Salmon())));
        platform.getRestaurants("Sandwich Palace").addMenu("Beef Sandwich",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Beef())));
        platform.getRestaurants("Sandwich Palace").addMenu("Tofu Sandwich",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Tofu())));
        platform.getRestaurants("Sandwich Palace").addMenu("Cheese Sandwich",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Cheese())));

        platform.registerRestaurant(new ResturantBuilder().setCounty("LA County").setAddress("101 American Blvd").setName("Salad Barn").setCuisineType("American").setOperatingHours("11AM-12AM").createRestaurant());
        platform.getRestaurants("Salad Barn").addMenu("Fish Salad",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Cheese(),new Salmon())));
        platform.getRestaurants("Salad Barn").addMenu("Beef Salad",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Beef())));
        platform.getRestaurants("Salad Barn").addMenu("Tofu Salad",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Tofu())));
        platform.getRestaurants("Salad Barn").addMenu("BlackBean Salad",new Noodles(),new ArrayList<FoodToppings>(List.of(new Egg(),new Peanut(),new Cheese())));

        System.out.println("=========================================================================================");
        // Register Drivers
        platform.registerDriver(new DriverBuilder().setName("James Smith").setAddress("123 Dragon Street").setCounty("LA County").setShift("1st shift: 8AM - 4PM").createDriver());
        platform.registerDriver(new DriverBuilder().setName("Maria Garcia").setAddress("456 Taco Way").setCounty("Orange County").setShift("2nd shift: 4PM - 12AM").createDriver());
        platform.registerDriver(new DriverBuilder().setName("John Johnson").setAddress("789 Sandwich Place").setCounty("San Bernardino County").setShift("3rd shift: 12AM - 8AM").createDriver());
        platform.registerDriver(new DriverBuilder().setName("Sophia Lee").setAddress("101 American Blvd").setCounty("LA County").setShift("1st shift: 8AM - 4PM").createDriver());
        platform.registerDriver(new DriverBuilder().setName("Michael Brown").setAddress("456 Taco Way").setCounty("Orange County").setShift("2nd shift: 4PM - 12AM").createDriver());
        platform.registerDriver(new DriverBuilder().setName("Linda Davis").setAddress("789 Sandwich Place").setCounty("San Bernardino County").setShift("3rd shift: 12AM - 8AM").createDriver());
        platform.registerDriver(new DriverBuilder().setName("Robert Wilson").setAddress("101 American Blvd").setCounty("LA County").setShift("2nd shift: 4PM - 12AM").createDriver());
        platform.registerDriver(new DriverBuilder().setName("Sarah Moore").setAddress("456 Taco Way").setCounty("Orange County").setShift("3rd shift: 12AM - 8AM").createDriver());

        System.out.println("=========================================================================================");
        // Register Customers
        platform.registerCustomer(new CustomerBuilder().setName("Alice Johnson").setAddress("123 Dragon Street").setCounty("LA County").setDiet(Diet.Vegan).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Carlos Martinez").setAddress("456 Taco Way").setCounty("Orange County").setDiet(Diet.Vegetarian).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Jessica Lee").setAddress("789 Sandwich Place").setCounty("San Bernardino County").setDiet(Diet.Pescetarian).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Mike Brown").setAddress("101 American Blvd").setCounty("LA County").setDiet(Diet.Paleo).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Rachel Wilson").setAddress("123 Dragon Street").setCounty("Orange County").setDiet(Diet.NutAllergy).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Steven Clark").setAddress("789 Sandwich Place").setCounty("San Bernardino County").setDiet(Diet.LactoseIntolerance).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Ashley Taylor").setAddress("101 American Blvd").setCounty("LA County").setDiet(Diet.NoRestriction).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Chris Jones").setAddress("456 Taco Way").setCounty("Orange County").setDiet(Diet.NoRestriction).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Emma Wilson").setAddress("789 Sandwich Place").setCounty("San Bernardino County").setDiet(Diet.NoRestriction).createCustomer());
        platform.registerCustomer(new CustomerBuilder().setName("Oliver Thomas").setAddress("123 Dragon Street").setCounty("LA County").setDiet(Diet.NoRestriction).createCustomer());

        System.out.println("=========================================================================================");
        // Place multiple orders

        // Order 1 - Time within 1st shift (8AM - 4PM)
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.HOUR_OF_DAY, 10); // 10AM
        calendar1.set(Calendar.MINUTE, 0);
        Date orderTime1 = calendar1.getTime();

        List<Food> meals1 = new ArrayList<>();
        meals1.add(platform.getRestaurants("Golden Dragon").getMeal("Fish Noodle",platform.getCustomers("Alice Johnson").getDiet(),new Spinach()));
        meals1.add(platform.getRestaurants("Golden Dragon").getMeal("Beef Noodle",platform.getCustomers("Alice Johnson").getDiet(),new Apple()));
        meals1.add(platform.getRestaurants("Golden Dragon").getMeal("Tofu Noodle",platform.getCustomers("Alice Johnson").getDiet(),new BlackBean()));
        meals1.add(platform.getRestaurants("Golden Dragon").getMeal("Cheese Noodle",platform.getCustomers("Alice Johnson").getDiet(),new Apple()));


        Order order1 = new Order(platform.getRestaurants("Golden Dragon"), platform.getCustomers("Alice Johnson"), meals1, orderTime1);
        platform.placeOrder(order1);

        System.out.println("=========================================================================================");
        // Order 2 - Time within 2nd shift (4PM - 12AM)
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY, 18); // 6PM
        calendar2.set(Calendar.MINUTE, 5);
        Date orderTime2 = calendar2.getTime();
        List<Food> meals2 = new ArrayList<>();

        meals2.add(platform.getRestaurants("Taco Fiesta").getMeal("Fish Taco",platform.getCustomers("Carlos Martinez").getDiet(),new Spinach()));
        meals2.add(platform.getRestaurants("Taco Fiesta").getMeal("Beef Taco",platform.getCustomers("Carlos Martinez").getDiet(),new Peanut()));
        meals2.add(platform.getRestaurants("Taco Fiesta").getMeal("Tofu Taco",platform.getCustomers("Carlos Martinez").getDiet(),new Egg()));
        meals2.add(platform.getRestaurants("Taco Fiesta").getMeal("BlackBean Taco",platform.getCustomers("Carlos Martinez").getDiet(),new Cheese()));

        Order order2 = new Order(platform.getRestaurants("Taco Fiesta"), platform.getCustomers("Carlos Martinez"), meals2, orderTime2);
        platform.placeOrder(order2);

        System.out.println("=========================================================================================");
        // Order 3 - Time within 3rd shift (12AM - 8AM)
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.HOUR_OF_DAY, 2); // 2AM
        calendar3.set(Calendar.MINUTE, 10);
        Date orderTime3 = calendar3.getTime();
        List<Food> meals3 = new ArrayList<>();

        meals3.add(platform.getRestaurants("Sandwich Palace").getMeal("Fish Sandwich",platform.getCustomers("Jessica Lee").getDiet(),new Spinach()));
        meals3.add(platform.getRestaurants("Sandwich Palace").getMeal("Beef Sandwich",platform.getCustomers("Jessica Lee").getDiet(),new BlackBean()));
        meals3.add(platform.getRestaurants("Sandwich Palace").getMeal("Tofu Sandwich",platform.getCustomers("Jessica Lee").getDiet(),new Egg()));
        meals3.add(platform.getRestaurants("Sandwich Palace").getMeal("Cheese Sandwich",platform.getCustomers("Jessica Lee").getDiet(),new Apple()));

        Order order3 = new Order(platform.getRestaurants("Sandwich Palace"), platform.getCustomers("Jessica Lee"), meals3, orderTime3);
        platform.placeOrder(order3);

        System.out.println("=========================================================================================");
        // Order 4 - Time within 1st shift (8AM - 4PM)
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(Calendar.HOUR_OF_DAY, 14); // 2PM
        calendar4.set(Calendar.MINUTE, 15);
        Date orderTime4 = calendar4.getTime();

        List<Food> meals4 = new ArrayList<>();
        meals4.add(platform.getRestaurants("Salad Barn").getMeal("Fish Salad",platform.getCustomers("Mike Brown").getDiet(),new Spinach()));
        meals4.add(platform.getRestaurants("Salad Barn").getMeal("Beef Salad",platform.getCustomers("Mike Brown").getDiet(),new BlackBean()));
        meals4.add(platform.getRestaurants("Salad Barn").getMeal("Tofu Salad",platform.getCustomers("Mike Brown").getDiet(),new Egg()));
        meals4.add(platform.getRestaurants("Salad Barn").getMeal("BlackBean Salad",platform.getCustomers("Mike Brown").getDiet(),new Cheese()));

        Order order4 = new Order(platform.getRestaurants("Salad Barn"), platform.getCustomers("Mike Brown"), meals4, orderTime4);
        platform.placeOrder(order4);

        System.out.println("=========================================================================================");
        // Order 5 - Time within 1st shift (8AM - 4PM)
        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(Calendar.HOUR_OF_DAY, 11); // 11AM
        calendar5.set(Calendar.MINUTE, 20);
        Date orderTime5 = calendar5.getTime();

        List<Food> meals5 = new ArrayList<>();
        meals5.add(platform.getRestaurants("Golden Dragon").getMeal("Fish Noodle",platform.getCustomers("Rachel Wilson").getDiet(),new Spinach()));
        meals5.add(platform.getRestaurants("Golden Dragon").getMeal("Beef Noodle",platform.getCustomers("Rachel Wilson").getDiet(),new Apple()));
        meals5.add(platform.getRestaurants("Golden Dragon").getMeal("Tofu Noodle",platform.getCustomers("Rachel Wilson").getDiet(),new BlackBean()));
        meals5.add(platform.getRestaurants("Golden Dragon").getMeal("Cheese Noodle",platform.getCustomers("Rachel Wilson").getDiet(),new Apple()));

        Order order5 = new Order(platform.getRestaurants("Golden Dragon"), platform.getCustomers("Rachel Wilson"), meals5, orderTime5);
        platform.placeOrder(order5);

        System.out.println("=========================================================================================");
        // Order 6 - Time within 2nd shift (4PM - 12AM)
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(Calendar.HOUR_OF_DAY, 19); // 7PM
        calendar6.set(Calendar.MINUTE, 25);
        Date orderTime6 = calendar6.getTime();

        List<Food> meals6 = new ArrayList<>();

        meals6.add(platform.getRestaurants("Taco Fiesta").getMeal("Fish Taco",platform.getCustomers("Steven Clark").getDiet(),new Spinach()));
        meals6.add(platform.getRestaurants("Taco Fiesta").getMeal("Beef Taco",platform.getCustomers("Steven Clark").getDiet(),new Peanut()));
        meals6.add(platform.getRestaurants("Taco Fiesta").getMeal("Tofu Taco",platform.getCustomers("Steven Clark").getDiet(),new Egg()));
        meals6.add(platform.getRestaurants("Taco Fiesta").getMeal("BlackBean Taco",platform.getCustomers("Steven Clark").getDiet(),new Cheese()));

        Order order6 = new Order(platform.getRestaurants("Taco Fiesta"), platform.getCustomers("Steven Clark"), meals6, orderTime6);
        platform.placeOrder(order6);

        System.out.println("=========================================================================================");
        // Order 7 - Time within 3rd shift (12AM - 8AM)
        Calendar calendar7 = Calendar.getInstance();
        calendar7.set(Calendar.HOUR_OF_DAY, 3); // 3AM
        calendar7.set(Calendar.MINUTE, 30);
        Date orderTime7 = calendar7.getTime();

        List<Food> meals7 = new ArrayList<>();
        meals7.add(platform.getRestaurants("Sandwich Palace").getMeal("Fish Sandwich",platform.getCustomers("Ashley Taylor").getDiet(),new Spinach()));
        meals7.add(platform.getRestaurants("Sandwich Palace").getMeal("Beef Sandwich",platform.getCustomers("Ashley Taylor").getDiet(),new BlackBean()));
        meals7.add(platform.getRestaurants("Sandwich Palace").getMeal("Tofu Sandwich",platform.getCustomers("Ashley Taylor").getDiet(),new Egg()));
        meals7.add(platform.getRestaurants("Sandwich Palace").getMeal("Cheese Sandwich",platform.getCustomers("Ashley Taylor").getDiet(),new Apple()));

        Order order7 = new Order(platform.getRestaurants("Sandwich Palace"), platform.getCustomers("Ashley Taylor"), meals7, orderTime7);
        platform.placeOrder(order7);

        System.out.println("=========================================================================================");
        // Order 8 - Time within 1st shift (8AM - 4PM)
        Calendar calendar8 = Calendar.getInstance();
        calendar8.set(Calendar.HOUR_OF_DAY, 9); // 9AM
        calendar8.set(Calendar.MINUTE, 35);
        Date orderTime8 = calendar8.getTime();

        List<Food> meals8 = new ArrayList<>();
        meals8.add(platform.getRestaurants("Salad Barn").getMeal("Fish Salad",platform.getCustomers("Chris Jones").getDiet(),new Spinach()));
        meals8.add(platform.getRestaurants("Salad Barn").getMeal("Beef Salad",platform.getCustomers("Chris Jones").getDiet(),new BlackBean()));
        meals8.add(platform.getRestaurants("Salad Barn").getMeal("Tofu Salad",platform.getCustomers("Chris Jones").getDiet(),new Egg()));
        meals8.add(platform.getRestaurants("Salad Barn").getMeal("BlackBean Salad",platform.getCustomers("Chris Jones").getDiet(),new Cheese()));

        Order order8 = new Order(platform.getRestaurants("Salad Barn"), platform.getCustomers("Chris Jones"), meals8, orderTime8);
        platform.placeOrder(order8);

        System.out.println("=========================================================================================");
        // Order 9 - Time within 2nd shift (4PM - 12AM)
        Calendar calendar9 = Calendar.getInstance();
        calendar9.set(Calendar.HOUR_OF_DAY, 20); // 8PM
        calendar9.set(Calendar.MINUTE, 40);
        Date orderTime9 = calendar9.getTime();

        List<Food> meals9 = new ArrayList<>();
        meals9.add(platform.getRestaurants("Golden Dragon").getMeal("Fish Noodle",platform.getCustomers("Emma Wilson").getDiet(),new Spinach()));
        meals9.add(platform.getRestaurants("Golden Dragon").getMeal("Beef Noodle",platform.getCustomers("Emma Wilson").getDiet(),new Apple()));
        meals9.add(platform.getRestaurants("Golden Dragon").getMeal("Tofu Noodle",platform.getCustomers("Emma Wilson").getDiet(),new BlackBean()));
        meals9.add(platform.getRestaurants("Golden Dragon").getMeal("Cheese Noodle",platform.getCustomers("Emma Wilson").getDiet(),new Apple()));

        Order order9 = new Order(platform.getRestaurants("Golden Dragon"), platform.getCustomers("Emma Wilson"), meals9, orderTime9);
        platform.placeOrder(order9);

        System.out.println("=========================================================================================");
        // Order 10 - Time within 3rd shift (12AM - 8AM)
        Calendar calendar10 = Calendar.getInstance();
        calendar10.set(Calendar.HOUR_OF_DAY, 4); // 4AM
        calendar10.set(Calendar.MINUTE, 45);
        Date orderTime10 = calendar10.getTime();

        List<Food> meals10 = new ArrayList<>();
        meals10.add(platform.getRestaurants("Taco Fiesta").getMeal("Fish Taco",platform.getCustomers("Oliver Thomas").getDiet(),new Spinach()));
        meals10.add(platform.getRestaurants("Taco Fiesta").getMeal("Beef Taco",platform.getCustomers("Oliver Thomas").getDiet(),new Peanut()));
        meals10.add(platform.getRestaurants("Taco Fiesta").getMeal("Tofu Taco",platform.getCustomers("Oliver Thomas").getDiet(),new Egg()));
        meals10.add(platform.getRestaurants("Taco Fiesta").getMeal("BlackBean Taco",platform.getCustomers("Oliver Thomas").getDiet(),new Apple()));

        Order order10 = new Order(platform.getRestaurants("Taco Fiesta"), platform.getCustomers("Oliver Thomas"), meals10, orderTime10);
        platform.placeOrder(order10);

        System.out.println("=========================================================================================");
    }
}
