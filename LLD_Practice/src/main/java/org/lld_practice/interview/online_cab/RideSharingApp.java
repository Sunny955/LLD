package org.lld_practice.interview.online_cab;

public class RideSharingApp {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Alice", "Toyota");
        Driver driver2 = new Driver("Bob", "Honda");

        // Drivers offer rides
        driver1.offerRide(new Ride("A", "B", 4, 10));
        driver2.offerRide(new Ride("C", "D", 2, 15));

        // Riders request rides
        Rider rider1 = new Rider("John");
        Rider rider2 = new Rider("Emma");

        rider1.requestRide("A", "B", 2);
        rider2.requestRide("C", "D", 1);
    }
}
