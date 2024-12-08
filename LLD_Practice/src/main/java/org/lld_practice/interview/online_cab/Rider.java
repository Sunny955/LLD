package org.lld_practice.interview.online_cab;

public class Rider extends User {

    public Rider(String name) {
        super(name);
    }

    public void requestRide(String origin, String destination, int noOfSeats) {
        System.out.println("Rider " + name + " requesting ride from " + origin + " to " + destination);
        RideService.getInstance().requestRide(this, origin, destination, noOfSeats);
    }

    public void notifyRideCompletion(double amount) {
        System.out.println("Rider " + name + " has been charged: Rs" + amount);
    }
}
