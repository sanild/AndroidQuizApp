package com.bawp.truecitizen.model;

public class Question {

    private int answer;
    private boolean answerTrue;

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean isAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.answerTrue = answerTrue;
    }

    public Question(int answer, boolean answerTrue) {
        this.answer = answer;
        this.answerTrue = answerTrue;
    }
}
