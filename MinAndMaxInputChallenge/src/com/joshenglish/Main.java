package com.joshenglish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
	    while (true) {
	        System.out.println("Enter a number: ");
	        if(scanner.hasNextInt()) {
	            int userNum = scanner.nextInt();
	            scanner.nextLine(); //handle newline
	            min = userNum < min ? userNum : min;
	            max = userNum > max ? userNum : max;
            } else {
	            scanner.nextLine(); //handle invalid input
	            break;
            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	    scanner.close();
    }
}
