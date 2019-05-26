package com.joshenglish;

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i < 10; i++) {
	        Car car = getRandomCar();
	        System.out.println("Car is named: " + car.getName());
	        car.startEngine();
	        car.accelerate();
	        car.brake();
	        System.out.println();
        }
    }

    public static Car getRandomCar() {
        int rand = (int) (Math.random() * 3) + 1;
        switch (rand) {
            case 1:
                return new Car("Generic", 4);
            case 2:
                return new Porsche();
            case 3:
                return new BMW();
            default:
                return null;
        }
    }
}
