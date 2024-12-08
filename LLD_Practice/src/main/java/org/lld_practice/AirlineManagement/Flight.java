package org.lld_practice.AirlineManagement;

import java.util.Date;
import java.util.List;

public class Flight {
    private String flightNumber;
    private String source;
    private String dest;
    private Date departureTime;
    private Aircraft aircraft;
    List<Passenger> passengers;
    List<CrewMember> crewMembers;

    public Flight(String flightNumber, String source, String dest, Date departureTime, Aircraft aircraft, List<Passenger> passengers, List<CrewMember> crewMembers) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.dest = dest;
        this.departureTime = departureTime;
        this.aircraft = aircraft;
        this.passengers = passengers;
        this.crewMembers = crewMembers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
