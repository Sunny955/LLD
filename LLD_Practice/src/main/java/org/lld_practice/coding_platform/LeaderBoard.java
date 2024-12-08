package org.lld_practice.coding_platform;

import java.util.Comparator;
import java.util.List;

public class LeaderBoard {
    public void displayLeaderBoard(List<User> users, boolean ascendingOrder) {
        if (ascendingOrder) {
            users.sort(Comparator.comparingInt(User::getScore));
        } else {
            users.sort(Comparator.comparingInt(User::getScore).reversed());
        }

        for (User user : users) {
            System.out.println("User: " + user.getUserName() + ", Score: " + user.getScore());
        }
    }
}
