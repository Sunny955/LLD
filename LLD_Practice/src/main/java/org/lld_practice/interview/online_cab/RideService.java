package org.lld_practice.interview.online_cab;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    private static RideService instance;
    private List<Ride> activeRides;
    private static final double AMOUNT_PER_KM = 10.0;

    private RideService() {
        activeRides = new ArrayList<>();
    }

    public static synchronized RideService getInstance() {
        if (instance == null) {
            instance = new RideService();
        }
        return instance;
    }

    public void offerRide(Driver d, Ride r) {
        activeRides.add(r);
        System.out.println("Ride offered by " + d.getName());
    }

    public void requestRide(Rider rider, String origin, String destination, int noOfSeats) {
        Ride selectedRide = null;

        for (Ride ride : activeRides) {
            if (ride.getOrigin().equals(origin) &&
                    ride.getDestination().equals(destination) &&
                    ride.getNoOfSeats() >= noOfSeats) {
                selectedRide = ride;
                break;
            }
        }

        if (selectedRide != null) {
            System.out.println("Ride found for " + rider.getName());
            double fare = calculateFare(selectedRide, noOfSeats);
            rider.notifyRideCompletion(fare);
            completeRide(selectedRide);
        } else {
            System.out.println("No ride available for " + rider.getName());
        }
    }

    private void completeRide(Ride ride) {
        activeRides.remove(ride);
        System.out.println("Ride completed from " + ride.getOrigin() + " to " + ride.getDestination());
    }

    private double calculateFare(Ride ride, int noOfSeats) {
        PricingStrategy pricingStrategy;

        if (noOfSeats >= 2) {
            pricingStrategy = new MultiseatPricing();
        } else {
            pricingStrategy = new SingleseatPricing();
        }

        return pricingStrategy.calculateFare(ride, AMOUNT_PER_KM);
    }
}
