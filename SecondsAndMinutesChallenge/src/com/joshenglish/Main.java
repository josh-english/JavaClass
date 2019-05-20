package com.joshenglish;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        String duration = getDurationString(65, 45);
        System.out.println(duration);
        duration = getDurationString(3945);
        System.out.println(duration);
    }

    private static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int mins = minutes % 60;
        return String.format("%02dh %02dm %02ds", hours, mins, seconds);
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int mins = seconds / 60;
        int secs = seconds % 60;
        return getDurationString(mins, secs);
    }
}
