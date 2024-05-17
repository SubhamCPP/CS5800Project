package cppfooddelivery.users;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Driver extends User {
    private String shift;
    private List<Date[]> ongoingDeliveries;

    public Driver(String name, String address, String county, String shift) {
        super(name, address, county);
        this.shift = shift;
        this.ongoingDeliveries = new ArrayList<>();
    }

    public boolean isAvailable(Date orderTime, String county, Date estimatedDeliveryTime) {
        clearPastDeliveries();
        boolean available = this.county.equals(county) && isWithinShift(orderTime) && !hasConflict(orderTime, estimatedDeliveryTime);
        System.out.println("Driver " + name + " availability: " + available);
        return available;
    }

    private boolean isWithinShift(Date orderTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        int orderHour = Integer.parseInt(sdf.format(orderTime));

        switch (shift) {
            case "1st shift: 8AM - 4PM":
                return orderHour >= 8 && orderHour < 16;
            case "2nd shift: 4PM - 12AM":
                return orderHour >= 16 || orderHour < 1; // Includes hour 0 which is 12AM
            case "3rd shift: 12AM - 8AM":
                return orderHour < 8 && orderHour >= 0;
            default:
                return false;
        }
    }

    private boolean hasConflict(Date orderTime, Date estimatedDeliveryTime) {
        for (Date[] delivery : ongoingDeliveries) {
            if (!orderTime.after(delivery[1])) {
                return true;
            }
        }
        return false;
    }

    public void addDelivery(Date pickUpTime, Date deliveryTime) {
        ongoingDeliveries.add(new Date[] { pickUpTime, deliveryTime });
    }

    public void clearPastDeliveries() {
        Date now = new Date();
        ongoingDeliveries.removeIf(delivery -> now.after(delivery[1]));
    }

    public String getShift() {
        return shift;
    }
}
