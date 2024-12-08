package org.lld_practice.interview.online_cab;

public class SingleseatPricing implements PricingStrategy {

    @Override
    public double calculateFare(Ride ride, double amountPerKm) {
        return ride.getDistanceInKm() * amountPerKm;
    }

}
