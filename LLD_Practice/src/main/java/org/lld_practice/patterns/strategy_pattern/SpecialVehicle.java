package org.lld_practice.patterns.strategy_pattern;

public class SpecialVehicle extends Vehicle{
    public SpecialVehicle() {
        super(new SpecialDriveStrategy());
    }
}
