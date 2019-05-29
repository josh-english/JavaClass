package com.joshenglish;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many integers would you like to enter?\r");
        int count = 5;
        if(scanner.hasNextInt()) {
            count = scanner.nextInt();
        }
	    int[] integers = readIntegers(count);
        System.out.println("The minimum of entered integers is: " + findMin(integers));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter in " + count + " integers:\r");
        int[] array = new int[count];
        int entered = 0;
        while (entered < count) {
            if(scanner.hasNextInt()) {
                array[entered] = scanner.nextInt();
                entered++;
            } else {
                scanner.nextLine();
            }
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
