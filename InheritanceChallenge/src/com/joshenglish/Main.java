package com.joshenglish;

public class Main {

    public static void main(String[] args) {
	    Vehicle bike = new Vehicle(1);
	    bike.move();
	    bike.increaseSpeed(10);
	    bike.move();
	    bike.decreaseSpeed(6);
	    bike.move();

	    System.out.println();
	    Car car1 = new Car(5, 4);
	    car1.move();
	    car1.increaseGear();
	    car1.move();
        car1.increaseGear();
        car1.move();
        car1.increaseGear();
        car1.move();
        car1.increaseGear();
        car1.move();
	    car1.decreaseGear();
	    car1.move();
	    car1.steerLeft();
	    car1.steerRight();

	    System.out.println();
	    System.out.println(Porsche.getMake());
	    Porsche p911 = new Porsche(10, 4, "911");
        p911.move();
        p911.increaseGear();
        p911.move();
        p911.increaseGear();
        p911.move();
        p911.increaseGear();
        p911.move();
        p911.increaseGear();
        p911.move();
        p911.increaseGear();
        p911.move();
        p911.decreaseGear();
        p911.move();
        p911.steerLeft();
        p911.steerRight();
    }
}
