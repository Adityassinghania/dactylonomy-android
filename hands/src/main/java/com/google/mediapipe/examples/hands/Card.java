package com.google.mediapipe.examples.hands;

public class Card {
    private String image;
    private int correctAnswer;
    public Card(String image, int correctAnswer){
        this.image = image;
        this.correctAnswer = correctAnswer;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
