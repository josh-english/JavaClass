package com.joshenglish;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5){
	        System.out.println(count);
	        count++;
        }

	    do {
			System.out.println("Count value was " + count);
			count++;
		} while (count != 6);

	    int number = 4;
	    int finish = 20;
	    count = 0;
	    while (number <= finish) {
	    	number++;
	    	if(!isEvenNumber(number)) {
	    		continue;
			}
	    	System.out.println("Even number " + number);
	    	count++;
	    	if(count == 5) {
	    		break;
			}
		}
	    System.out.println("Found " + count + " even numbers.");
    }

    //challenge
	private static boolean isEvenNumber(int number) {
    	return number % 2 == 0;
	}
}
