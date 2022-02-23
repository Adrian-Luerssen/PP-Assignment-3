package com.example.assignment;

public class Player {
    private int correctAnswers;
    private int questionsAnswered;
    private boolean isCheater;

    public Player() {
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void incrementCorrect() {
        this.correctAnswers++;
    }

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public void incrementAnswered() {
        this.questionsAnswered++;
    }

    public boolean isCheater() {
        return isCheater;
    }

    public void setCheater(boolean cheater) {
        isCheater = cheater;
    }
}
