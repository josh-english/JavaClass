package com.joshenglish;

public class Main {

    public static void main(String[] args) {
        // Width of int = 32
        int myIntValue = 5 / 3;
        // width of float = 32
        float myFloatValue = 5f / 3f;
        // width of double = 64
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Challenge:
        double numPunds = 200d;
        double numKilos = numPunds * 0.45359237d;
        System.out.println("numKilos = " + numKilos);
        double pi = 3.141_592_7d;
    }
}
