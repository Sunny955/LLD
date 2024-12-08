package org.lld_practice.interview.online_cab;

public interface PricingStrategy {
    double calculateFare(Ride ride, double amountPerKm);
}
