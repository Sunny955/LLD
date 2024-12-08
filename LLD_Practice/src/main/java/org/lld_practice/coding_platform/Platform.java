package org.lld_practice.coding_platform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Platform {
    private static Platform instance;
    private final Map<String, User> users;
    private final Map<Integer, Contest> contests;
    private final List<Question> questions;
    private int contestCounter;
    private int questionCounter;

    public Platform() {
        users = new HashMap<>();
        contests = new HashMap<>();
        questions = new ArrayList<>();
        contestCounter = 1;
        questionCounter = 1;
    }

    public static synchronized Platform getInstance() {
        if (instance == null) {
            instance = new Platform();
        }
        return instance;
    }

    public void createUser(String userName) {
        if (!users.containsKey(userName)) {
            users.put(userName, new User(userName));
        } else {
            System.out.println("User already exists!");
        }
    }

    public void createQuestion(DifficultyLevel difficultyLevel) {
        questions.add(new Question(questionCounter++, difficultyLevel));
    }

    public void listQuestions(DifficultyLevel difficultyLevel) {
        for (Question question : questions) {
            if (question.getDifficulty() == difficultyLevel) {
                System.out.println("Question ID: " + question.getId() + ", Difficulty: " + question.getDifficulty());
            }
        }
    }

    public void createContest(String contestName, ContestLevel contestLevel, String creatorUserName) {
        User creator = users.get(creatorUserName);
        if (creator != null) {
            Contest contest = new Contest(contestCounter++, contestName, contestLevel, creator);
            contests.put(contest.getContestId(), contest);

            // Add questions to contest based on contest level
            for (Question question : questions) {
                contest.addQuestion(question);
            }
        } else {
            System.out.println("User not found!");
        }
    }

    public void listContests(ContestLevel contestLevel) {
        for (Contest contest : contests.values()) {
            if (contest.getContestLevel() == contestLevel) {
                System.out.println("Contest ID: " + contest.getContestId() + ", Contest Name: " + contest.getContestName());
            }
        }
    }

    public void attendContest(int contestId, String userName) {
        User user = users.get(userName);
        Contest contest = contests.get(contestId);

        if (user != null && contest != null) {
            contest.addParticipant(user);
        } else {
            System.out.println("User or Contest not found!");
        }
    }

    public void runContest(int contestId, String creatorUserName) {
        Contest contest = contests.get(contestId);
        if (contest != null && contest.getCreator().getUserName().equals(creatorUserName)) {
            contest.startContest();
            System.out.println("Contest started: " + contest.getContestName());
        } else {
            System.out.println("Contest or User not found!");
        }
    }

    public void withdrawContest(int contestId) {
        contests.remove(contestId);
        System.out.println("Contest withdrawn.");
    }

    public void contestHistory(int contestId) {
        Contest contest = contests.get(contestId);
        if (contest != null) {
            System.out.println("Contest: " + contest.getContestName());
            for (User participant : contest.getParticipants()) {
                System.out.println("Participant: " + participant.getUserName());
            }
        } else {
            System.out.println("Contest not found.");
        }
    }

    public void leaderBoard(String order) {
        boolean ascendingOrder = order.equalsIgnoreCase("asc");
        new LeaderBoard().displayLeaderBoard(new ArrayList<>(users.values()), ascendingOrder);
    }
}
