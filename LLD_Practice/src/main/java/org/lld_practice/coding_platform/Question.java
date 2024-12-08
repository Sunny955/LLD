package org.lld_practice.coding_platform;

public class Question {
    int id;
    String content;
    DifficultyLevel level;
    int score;

    public Question(int id, DifficultyLevel level) {
        this.id = id;
        this.level = level;
        this.score = calculateScore(level);
    }

    private int calculateScore(DifficultyLevel level) {
        switch (level) {
            case LOW: return 10;
            case MID: return 20;
            case HIGH: return 30;
        }
        return 0;
    }

    public DifficultyLevel getDifficulty() {
        return level;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public int getScore() {
        return score;
    }

    public int getId() {
        return id;
    }
}
