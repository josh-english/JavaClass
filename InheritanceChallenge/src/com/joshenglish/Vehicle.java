package com.joshenglish;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Vehicle is moving at speed " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int amount) {
        this.speed += amount < 0 ? 0 : amount;
    }

    public void decreaseSpeed(int amount) {
        this.speed -= amount < 0 ? 0 : amount;
    }
}
