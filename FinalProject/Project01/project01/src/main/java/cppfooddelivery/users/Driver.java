package cppfooddelivery.users;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        // Check if driver is available based on shift, county, and ongoing deliveries
        boolean available = this.county.equals(county) && isWithinShift(orderTime) && !hasConflict(estimatedDeliveryTime);
        System.out.println("Driver " + name + " availability: " + available);
        return available;
    }

    private boolean isWithinShift(Date orderTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        int orderHour = Integer.parseInt(sdf.format(orderTime));

        switch (shift) {
            case "1st shift: 8AM - 4PM": // 8AM - 4PM
                return orderHour >= 8 && orderHour < 16;
            case "2nd shift: 4PM - 12AM": // 4PM - 12AM
                return orderHour >= 16 && orderHour < 24;
            case "3rd shift: 12AM - 8AM": // 12AM - 8AM
                return orderHour >= 0 && orderHour < 8;
            default:
                return false;
        }
    }

    private boolean hasConflict(Date estimatedDeliveryTime) {
        for (Date[] delivery : ongoingDeliveries) {
            if (estimatedDeliveryTime.before(delivery[1])) {
                return true;
            }
        }
        return false;
    }

    public void addDelivery(Date pickUpTime, Date deliveryTime) {
        ongoingDeliveries.add(new Date[] { pickUpTime, deliveryTime });
    }

    public String getShift() {
        return shift;
    }
}
