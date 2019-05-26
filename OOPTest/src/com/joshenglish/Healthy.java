package com.joshenglish;

public class Healthy extends Burger {
    private Topping topping1;
    private Topping topping2;
    private double finalPrice;

    public Healthy(String meat, Topping topping1, Topping topping2, Topping topping3, Topping topping4, double basePrice, Topping topping5, Topping topping6) {
        super("rye", meat, topping1, topping2, topping3, topping4, basePrice);
        this.topping1 = topping5;
        this.topping2 = topping6;
        this.finalPrice = super.getPrice();
        if (topping5 != null) {
            this.finalPrice += topping5.getPrice();
        }
        if (topping6 != null) {
            this.finalPrice += topping6.getPrice();
        }
    }

    public Healthy(String meat, Topping topping1, Topping topping2, Topping topping3, Topping topping4, double basePrice, Topping topping5) {
        super("rye", meat, topping1, topping2, topping3, topping4, basePrice);
        this.topping1 = topping5;
        this.topping2 = null;
    }

    public Healthy(String meat, Topping topping1, Topping topping2, Topping topping3, Topping topping4, double basePrice) {
        super("rye", meat, topping1, topping2, topping3, topping4, basePrice);
        this.topping1 = null;
        this.topping2 = null;
    }

    @Override
    protected void listPrice() {
        super.listPrice();
        if(topping1 != null) {
            System.out.println("Added topping: " + topping1.getName() + ", Price: " + topping1.getPrice());
        }
        if(topping2 != null) {
            System.out.println("Added topping: " + topping2.getName() + ", Price: " + topping2.getPrice());
        }
    }

    @Override
    public void printPrice() {
        this.listPrice();
        System.out.println("Burger final price: " + this.finalPrice);
    }
}
