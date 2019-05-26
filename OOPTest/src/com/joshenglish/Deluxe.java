package com.joshenglish;

public class Deluxe extends Burger {

    public Deluxe(String breadRoll, String meat, Topping chips, Topping drink, double basePrice) {
        super(breadRoll, meat, chips, drink, basePrice);
    }

    @Override
    protected void listPrice() {
        super.listPrice();
    }

    @Override
    public void printPrice() {
        super.printPrice();
    }
}
