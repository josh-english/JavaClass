package com.joshenglish;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
	    System.out.println("New score is " + newScore);
	    calculateScore(75);
	    calculateScore();
	    System.out.println("6 feet, 0 inches is " + calcFeetAndInchesToCentimeters(6, 0) + " cm");
        System.out.println("50 inches is " + calcFeetAndInchesToCentimeters(50) + " cm");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed played scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || (inches < 0 || inches >= 12)) {
            return -1;
        }
        int totalIn = feet * 12 + inches;
        return totalIn * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0 ) {
            return -1;
        }
        return inches * 2.54;
    }
}
