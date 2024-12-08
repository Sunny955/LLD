package org.lld_practice.patterns.strategy_pattern;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new SpecialVehicle();
        Vehicle vehicle1 = new PassengerVehicle();
        vehicle.drive();
        vehicle1.drive();
    }
}
