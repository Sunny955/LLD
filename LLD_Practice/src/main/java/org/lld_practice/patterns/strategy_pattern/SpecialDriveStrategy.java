package org.lld_practice.patterns.strategy_pattern;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special drive!");
    }
}
