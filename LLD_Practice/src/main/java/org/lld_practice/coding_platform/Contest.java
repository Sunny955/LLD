package org.lld_practice.coding_platform;

import java.util.ArrayList;
import java.util.List;

public class Contest {
    private int contestId;
    private String contestName;
    private ContestLevel contestLevel;
    private User creator;
    private List<Question> questions;
    private List<User> participants;
    private boolean isRunning;

    public Contest(int contestId, String contestName, ContestLevel contestLevel, User creator) {
        this.contestId = contestId;
        this.contestName = contestName;
        this.contestLevel = contestLevel;
        this.creator = creator;
        this.questions = new ArrayList<>();
        this.participants = new ArrayList<>();
        this.isRunning = false;
    }

    public int getContestId() {
        return contestId;
    }

    public User getCreator() {
        return creator;
    }

    public String getContestName() {
        return contestName;
    }

    public ContestLevel getContestLevel() {
        return contestLevel;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        if (question.getDifficulty().ordinal() <= contestLevel.ordinal()) {
            questions.add(question);
        }
    }

    public void addParticipant(User user) {
        participants.add(user);
    }

    public List<User> getParticipants() {
        return participants;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void startContest() {
        isRunning = true;
    }

    public void endContest() {
        isRunning = false;
    }
}
