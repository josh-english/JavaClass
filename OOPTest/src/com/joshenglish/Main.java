package com.joshenglish;

public class Main {

    public static void main(String[] args) {
        Topping lettuce = new Topping("lettuce", 0.25);
	    Burger burger = new Burger("white roll", "burger", lettuce, 1.5);
	    burger.printPrice();

	    System.out.println();
        Burger burger1 = new Burger("white roll", "burger", lettuce, lettuce, lettuce, lettuce, 1.5);
        burger1.printPrice();

        System.out.println();
        Topping cheese = new Topping("cheese", 1.00);
        Healthy hBurger = new Healthy("burger", lettuce, lettuce, lettuce, lettuce, 1.5, cheese, cheese);
        hBurger.printPrice();

        System.out.println();
        Topping chips = new Topping("chips", 1.50);
        Topping drink = new Topping("drink", 1.00);
        Deluxe dBurger = new Deluxe("wheat roll", "chicken", chips, drink, 1.5);
        dBurger.printPrice();
    }
}
