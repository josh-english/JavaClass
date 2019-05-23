package com.joshenglish;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Resolution nativeResolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, nativeResolution);

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPC = new PC(theCase, monitor, motherboard);
        // demonstrating composition
        myPC.powerUp();

        // Challenge
        System.out.println();
        Room myRoom = new Room(3, 4);
        House myHouse = new House(myRoom);
        myHouse.getRoom().printDetails();
        System.out.println("This call is equivalent to:");
        myHouse.printRoomDetails();
        System.out.println("The second call is more secure as it does not expose the room object to the main function.");
    }
}
