package org.lld_practice.interview.online_cab;

public class MultiseatPricing implements PricingStrategy {

    @Override
    public double calculateFare(Ride ride, double amountPerKm) {
        return ride.getNoOfSeats() * ride.getDistanceInKm() * 0.75 * amountPerKm;
    }

}
