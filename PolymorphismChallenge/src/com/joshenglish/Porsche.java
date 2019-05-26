package com.joshenglish;

public class Porsche extends Car {
    public Porsche() {
        super("Porsche", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Porche brakes");
    }
}
