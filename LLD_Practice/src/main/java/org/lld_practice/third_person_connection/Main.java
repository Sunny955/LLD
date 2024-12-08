package org.lld_practice.third_person_connection;

public class Main {
    public static void main(String[] args) {
        User alice = new User("1", "Alice");
        User bob = new User("2", "Bob");
        User charlie = new User("3", "Charlie");
        User dave = new User("4", "Dave");

        // Setting up connections
        alice.addConnection(bob); // Alice -> Bob (first-degree)
        bob.addConnection(charlie); // Bob -> Charlie (second-degree)
        charlie.addConnection(dave);

        ConnectionService service = new ConnectionService();

        System.out.println(service.isFirstDegreeConnection(alice, bob)); // true
        System.out.println(service.isFirstDegreeConnection(alice, charlie)); // false
        System.out.println(service.isWithinConnectionNetwork(alice, charlie, 2)); // true
        System.out.println(service.isWithinConnectionNetwork(alice, dave, 3)); // true
        System.out.println(service.isWithinConnectionNetwork(alice, dave, 2)); // false
    }
}
