package com.joshenglish;

public class Main {

    public static void main(String[] args) {
        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = myMinValue / 2;
        System.out.println("myTotal = " + myTotal);

        // Byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // Short has a width of 16
        short myShortValue = -32_768;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // Long has a width of 64
        long myLong = -9_223_372_036_854_775_808L;

        // Challenge
        byte newByte = 64;
        short newShort = 16_768;
        int newInt = 1_147_483_648;
        long newLong = 50000L + 10L * (newByte + newShort + newInt);
        System.out.println("newLong = " + newLong);
    }
}
