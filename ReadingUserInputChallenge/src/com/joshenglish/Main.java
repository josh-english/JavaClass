package com.joshenglish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printSumFromUserInput();
    }

    private static void printSumFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        int validEntries = 0;
        int sum = 0;
        while (validEntries < 10) {
            System.out.println("Enter number #" + (validEntries + 1) + ":");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                validEntries++;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of your number is: " + sum);
        scanner.close();
    }
}
