package org.lld_practice.third_person_connection;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<User> connections; // List of direct connections

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<User> getConnections() {
        return connections;
    }

    public void addConnection(User u) {
        connections.add(u);
    }
}
