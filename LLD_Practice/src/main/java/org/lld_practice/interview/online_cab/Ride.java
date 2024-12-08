package org.lld_practice.interview.online_cab;

public class Ride {
    private String origin;
    private String destination;
    private int noOfSeats;
    private double distanceInKm;

    public Ride(String origin, String destination, int noOfSeats, double distanceInKm) {
        this.origin = origin;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.distanceInKm = distanceInKm;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

}
