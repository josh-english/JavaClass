package com.joshenglish;

public class Car extends Vehicle {
    private int numWheels;
    protected int gear;

    public Car(int speed, int numWheels) {
        super(speed);
        this.numWheels = numWheels;
        this.gear = 1;
    }

    public void steerLeft() {
        System.out.println("Car steers left");
    }

    public void steerRight() {
        System.out.println("Car steers right");
    }

    @Override
    public void move() {
        System.out.println("Car is moving at speed " + this.getSpeed() + " in gear " + gear + " with " + numWheels + " wheels");
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void increaseGear() {
        this.gear += this.gear >= 4 ? 0 : 1;
        super.increaseSpeed(5);
    }

    public void decreaseGear() {
        this.gear -= this.gear < 0 ? 0 : 1;
        super.decreaseSpeed(5);
    }

    public int getGear() {
        return gear;
    }
}
