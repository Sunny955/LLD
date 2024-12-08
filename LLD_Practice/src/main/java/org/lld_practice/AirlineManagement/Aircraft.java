package org.lld_practice.AirlineManagement;

public class Aircraft {
    private String aircraftNumber;
    private String model;
    private int totalSeats;

    public Aircraft(String aircraftNumber, String model, int totalSeats) {
        this.aircraftNumber = aircraftNumber;
        this.model = model;
        this.totalSeats = totalSeats;
    }

    public String getAircraftNumber() {
        return aircraftNumber;
    }

    public String getModel() {
        return model;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setAircraftNumber(String aircraftNumber) {
        this.aircraftNumber = aircraftNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
}
