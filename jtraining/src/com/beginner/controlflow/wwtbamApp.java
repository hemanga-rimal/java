package com.beginner.controlflow;

public class wwtbamApp {
    public static void main(String[] args) {
        char correctAnswer = 'C';

        System.out.println("Who is named as the father of the light bulb?");
        System.out.println("Your answer was " + correctAnswer + ". Let's see if you were right");

        if (correctAnswer == 'C') {
            System.out.println("Correct! You just won $1000000!");
        }
        else {
            System.out.println("Wrong. The answer was C.");
        }


    }
}
