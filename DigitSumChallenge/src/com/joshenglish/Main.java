package com.joshenglish;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(125));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
