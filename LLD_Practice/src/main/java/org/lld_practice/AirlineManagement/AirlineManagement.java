package org.lld_practice.AirlineManagement;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirlineManagement {
    private List<Aircraft> aircrafts;
    private List<Flight> flights;
    private List<Passenger> passengers;
    private List<CrewMember> crewMembers;

    public AirlineManagement(List<Aircraft> aircrafts, List<Flight> flights, List<Passenger> passengers, List<CrewMember> crewMembers) {
        this.aircrafts = aircrafts;
        this.flights = flights;
        this.passengers = passengers;
        this.crewMembers = crewMembers;
    }

    public boolean checkAssignment() {
        Map<Passenger, Date> check =  new HashMap<>();
        Map<CrewMember,Date> crewMember = new HashMap<>();
        for(Flight flight: flights) {
            List<Passenger> passengerList = flight.getPassengers();
            List<CrewMember> crewMemberList = flight.getCrewMembers();
            for(Passenger p: passengerList) {
                if(!check.containsKey(p)) {
                    check.put(p,flight.getDepartureTime());
                }
                else {
                    if(check.get(p) == flight.getDepartureTime()) {
                        return false;
                    }
                }
            }

            for(CrewMember c: crewMemberList) {
                if (!crewMember.containsKey(c)) {
                    crewMember.put(c, flight.getDepartureTime());
                } else {
                    if (crewMember.get(c) == flight.getDepartureTime()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }
}
