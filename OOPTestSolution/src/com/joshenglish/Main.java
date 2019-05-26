package com.joshenglish;

import javax.annotation.processing.SupportedSourceVersion;
import java.lang.management.BufferPoolMXBean;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        System.out.println();
        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);
        healthyBurger.addHamburgerAddition1("egg", 5.43);
        healthyBurger.addHealthyAddition1("lentils", 3.41);
        System.out.println("Total Burger price is " + healthyBurger.itemizeHamburger());

        System.out.println();
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Burger price is " + deluxeBurger.itemizeHamburger());
    }
}
