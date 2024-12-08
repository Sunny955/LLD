package org.lld_practice.AirlineManagement;

import java.util.Date;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {

        Aircraft a1 = new Aircraft("A17253", "MODEL1826", 178);
        Aircraft a2 = new Aircraft("A45253", "MODEL9826", 300);
        Aircraft a3 = new Aircraft("A39740", "MODEL1899", 25);
        Aircraft a4 = new Aircraft("A19999", "MODEL1386", 250);
        Aircraft a5 = new Aircraft("B82649", "MODEL9266", 199);

        Passenger p1 = new Passenger("Jhanta Singh", "P273528");
        Passenger p2 = new Passenger("Chuta Jhanna", "P293764");
        Passenger p3 = new Passenger("Lulla Singh", "P1826373");
        Passenger p4 = new Passenger("Chulla Singh", "P2826373");
        Passenger p5 = new Passenger("Pekhana Singh", "P3826373");
        Passenger p6 = new Passenger("Thulla Singh", "P4826373");
        Passenger p7 = new Passenger("Kripala Singh", "P5826373");

        CrewMember c1 = new CrewMember("Chucha Prasad", "EP18363");
        CrewMember c2 = new CrewMember("Junna Prasad", "EP28363");
        CrewMember c3 = new CrewMember("Pipla Prasad", "EP38363");
        CrewMember c4 = new CrewMember("Mullu Prasad", "EP48363");
        CrewMember c5 = new CrewMember("Thenga Prasad", "EP58363");
        CrewMember c6 = new CrewMember("Junnu Prasad", "EP68363");

        Flight f1 = new Flight("E1273", "Delhi", "Lahore", new Date(), a1, List.of(p1, p2, p3), List.of(c1, c2));
        Flight f2 = new Flight("E3273", "Delhi", "London", new Date(), a2, List.of(p4, p5), List.of(c3, c4));

        List<Flight> flightList = List.of(f1, f2);
        List<Passenger> passengers = List.of(p1, p2, p3, p4, p5, p6, p7);
        List<CrewMember> crewMembers = List.of(c1, c2, c3, c4, c5, c6);
        List<Aircraft> aircrafts = List.of(a1, a2, a3, a4, a5);

        AirlineManagement airlineManagement = new AirlineManagement(aircrafts, flightList, passengers, crewMembers);

        System.out.println(airlineManagement.checkAssignment());
    }
}
