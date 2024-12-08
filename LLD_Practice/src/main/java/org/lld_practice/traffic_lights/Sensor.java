package org.lld_practice.traffic_lights;

public class Sensor {
    private int vehicleCount;
    public Sensor() {
        this.vehicleCount = 0;
    }
    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }
    public int getTrafficCount() {
        return vehicleCount;
    }
}
