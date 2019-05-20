package com.joshenglish;

public class Main {

    public static void main(String[] args) {
//	    int value = 3;
//	    if (value == 1) {
//	        System.out.println("Value was 1");
//        } else if (value == 2) {
//	        System.out.println("Value was 2");
//        } else {
//	        System.out.println("Was not 1 or 2");
//        }

	    int switchValue = 3;
	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, 4, or 5");
                break;
            default:
                System.out.println("Value was not a case");
                break;
        }

        char switchChar = 'F';
	    switch(switchChar) {
            case 'A':
                System.out.println("Found Char: 'A'");
                break;
            case 'B':
                System.out.println("Found Char: 'B'");
                break;
            case 'C':
                System.out.println("Found Char: 'C'");
                break;
            case 'D':
                System.out.println("Found Char: 'D'");
                break;
            case 'E':
                System.out.println("Found Char: 'E'");
                break;
            default:
                System.out.println("Char Not Found");
                break;
        }

        String month = "Jan";
	    switch(month.toLowerCase()) {
            case "jan":
                System.out.println("Its January");
                break;
            case "jun":
                System.out.println("Its June");
                break;
            default:
                System.out.println("Month not Found");
                break;
        }
    }
}
