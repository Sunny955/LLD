package org.lld_practice.third_person_connection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ConnectionService {
    public boolean isFirstDegreeConnection(User u1, User u2) {
        return u1.getConnections().contains(u2);
    }

    // Check if u2 is within second-third degree connection of u1
    public boolean isWithinConnectionNetwork(User u1, User u2, int maxDegree) {
        Set<String> visited = new HashSet<>();
        Queue<User> queue = new LinkedList<>();
        queue.add(u1);
        visited.add(u1.getUserId());

        int degree = 0;
        while (!queue.isEmpty() && degree <= maxDegree) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                User currentUser = queue.poll();

                for (User connection : currentUser.getConnections()) {
                    if (connection.getUserId().equals(u2.getUserId())) {
                        return true;
                    }

                    if (!visited.contains(connection.getUserId())) {
                        queue.add(connection);
                        visited.add(connection.getUserId());
                    }
                }
            }
        }
        return false;
    }
}
