package org.lld_practice.coding_platform;

public class Main {
    public static void main(String[] args) {
        Platform codingBlox = Platform.getInstance();

        codingBlox.createUser("Alice");
        codingBlox.createUser("Bob");

        codingBlox.createQuestion(DifficultyLevel.LOW);
        codingBlox.createQuestion(DifficultyLevel.MID);
        codingBlox.createQuestion(DifficultyLevel.HIGH);

        codingBlox.createContest("Beginner Contest", ContestLevel.LOW, "Alice");
        codingBlox.listContests(ContestLevel.LOW);

        codingBlox.attendContest(1, "Bob");

        codingBlox.runContest(1, "Alice");
        codingBlox.leaderBoard("asc");
        codingBlox.contestHistory(1);
    }
}
