package com.joshenglish;

public class Room {
    private int walls;
    private int doors;

    public Room(int walls, int doors) {
        this.walls = walls;
        this.doors = doors;
    }

    public void printDetails() {
        System.out.println("This room has " + doors + " doors and " + walls + " walls.");
    }
}
