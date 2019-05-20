package com.joshenglish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            // Deal with reading enter as separate line issue
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;
            if (age  >= 0 && age <= 120) {
                System.out.println("Hello " + name);
                System.out.println("You are " + age + " years old!");
            } else {
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("Entered non-numeric value for birth year.");
        }
        scanner.close();
    }
}
