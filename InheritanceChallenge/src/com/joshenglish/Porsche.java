package com.joshenglish;

public class Porsche extends Car {
    private static String make = "porsche";
    private String model;

    public Porsche(int speed, int numWheels, String model) {
        super(speed, numWheels);
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println("This " + make + " " + model + " is moving at speed " + this.getSpeed() + " in gear " + this.getGear() + " with " + this.getNumWheels() + " wheels");
    }

    @Override
    public void increaseGear() {
        this.gear += this.gear >= 5 ? 0 : 1;
        this.increaseSpeed(5);
    }

    @Override
    public void decreaseGear() {
        this.gear -= this.gear < 0 ? 0 : 1;
        this.increaseSpeed(5);
    }

    public static String getMake() {
        return make;
    }
}
