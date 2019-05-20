package com.joshenglish;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String player1 = "Josh";
        int score1 = 1500;
        int pos1 = calculateHighScorePosition(score1);
        displayHighScorePosition(player1, pos1);

        String player2 = "Joanna";
        int score2 = 900;
        int pos2 = calculateHighScorePosition(score2);
        displayHighScorePosition(player2, pos2);

        String player3 = "Tim";
        int score3 = 400;
        int pos3 = calculateHighScorePosition(score3);
        displayHighScorePosition(player3, pos3);

        String player4 = "Georgianna";
        int score4 = 50;
        int pos4 = calculateHighScorePosition(score4);
        displayHighScorePosition(player4, pos4);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
