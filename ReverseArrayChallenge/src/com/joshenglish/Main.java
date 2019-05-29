package com.joshenglish;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] myInts = new int[] {0,1,2,3,4,5,6};
	    System.out.println(Arrays.toString(myInts));
	    reverse(myInts);
        System.out.println(Arrays.toString(myInts));
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right - 1) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
