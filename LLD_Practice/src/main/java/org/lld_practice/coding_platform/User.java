package org.lld_practice.coding_platform;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private int score;
    private List<Contest> contestHistory;

    public User(String userName) {
        this.userName = userName;
        this.score = 0;
        this.contestHistory = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int score) {
        this.score += score;
    }

    public void addContestHistory(Contest contest) {
        contestHistory.add(contest);
    }

    public List<Contest> getContestHistory() {
        return contestHistory;
    }
}
