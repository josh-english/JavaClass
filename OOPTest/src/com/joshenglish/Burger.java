package com.joshenglish;

public class Burger {
    private String breadRoll;
    private String meat;
    private Topping topping1;
    private Topping topping2;
    private Topping topping3;
    private Topping topping4;
    private double basePrice;
    private double finalPrice;

    public Burger(String breadRoll, String meat, Topping topping1, Topping topping2, Topping topping3, Topping topping4, double basePrice) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
        this.basePrice = basePrice;
        this.finalPrice = basePrice;
        if (topping1 != null) {
            this.finalPrice += topping1.getPrice();
        }
        if (topping2 != null) {
            this.finalPrice += topping2.getPrice();
        }
        if (topping3 != null) {
            this.finalPrice += topping3.getPrice();
        }
        if (topping4 != null) {
            this.finalPrice += topping4.getPrice();
        }
    }

    public Burger(String breadRoll, String meat, Topping topping1, Topping topping2, Topping topping3, double basePrice) {
        this(breadRoll, meat, topping1, topping2, topping3, null, basePrice);
    }

    public Burger(String breadRoll, String meat, Topping topping1, Topping topping2, double basePrice) {
        this(breadRoll, meat, topping1, topping2, null, basePrice);
    }

    public Burger(String breadRoll, String meat, Topping topping1, double basePrice) {
        this(breadRoll, meat, topping1, null, basePrice);
    }

    public Burger(String breadRoll, String meat, double basePrice) {
        this(breadRoll, meat, null, basePrice);
    }

    protected void listPrice() {
        System.out.println("Burger base price: " + this.basePrice);
        if (topping1 != null) {
            System.out.println("Added topping: " + topping1.getName() + ", Price: " + topping1.getPrice());
        }
        if (topping2 != null) {
            System.out.println("Added topping: " + topping2.getName() + ", Price: " + topping2.getPrice());
        }
        if (topping3 != null) {
            System.out.println("Added topping: " + topping3.getName() + ", Price: " + topping3.getPrice());
        }
        if (topping4 != null) {
            System.out.println("Added topping: " + topping4.getName() + ", Price: " + topping4.getPrice());
        }
    }

    public void printPrice() {
        this.listPrice();
        System.out.println("Burger final price: " + this.finalPrice);
    }

    protected double getPrice() {
        return this.finalPrice;
    }

}
