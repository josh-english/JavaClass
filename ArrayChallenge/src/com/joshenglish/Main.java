package com.joshenglish;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] integers = getIntegers(5);
	    printArray(integers);
	    integers = sortIntegersDescending(integers);
	    printArray(integers);
    }

    public static void printArray(int[] array) {
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        int[] input = new int[number];
        System.out.println("Enter " + number + " integers.\r");
        for (int i = 0; i < number; i++) {
            input[i] = scanner.nextInt();
        }
        return input;
    }

    // simple bubble sort O(n^2)
    public static int[] sortIntegersDescending(int[] unsorted) {
        System.out.println("\nSorting integer array descending order with Bubblesort");
        int[] sorted = new int[unsorted.length];
        // copy to sorted array
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    int temp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
}
