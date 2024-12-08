package org.lld_practice.interview.online_cab;

public class Driver extends User {
    private String carModel;

    public Driver(String name, String carModel) {
        super(name);
        this.carModel = carModel;
    }

    public void offerRide(Ride ride) {
        System.out.println("Driver: " + name + " offerring ride from " + ride.getOrigin() + " to "
                + ride.getDestination() + " with model: " + carModel);
        RideService.getInstance().offerRide(this, ride);
    }
}
