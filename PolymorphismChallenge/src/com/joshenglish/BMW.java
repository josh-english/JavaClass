package com.joshenglish;

public class BMW extends Car {
    public BMW() {
        super("BMW", 5);
    }

    @Override
    public void startEngine() {
        System.out.println("BWM starts engine");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW accelerates (and bakes drive shaft)");
    }

    @Override
    public void brake() {
        System.out.println("BWM brakes");
    }
}
