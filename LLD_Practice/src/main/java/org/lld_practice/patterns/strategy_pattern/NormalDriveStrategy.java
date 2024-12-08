package org.lld_practice.patterns.strategy_pattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive!");
    }
}
