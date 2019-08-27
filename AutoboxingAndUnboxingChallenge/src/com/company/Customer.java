package com.company;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialAmount) {
        this.name = name;
        //Autoboxes to type Double from double
        this.transactions.add(initialAmount);
    }

    public void addTransaction(double amount) {
        //Autoboxes to type Double from double
        transactions.add(amount);
    }

    public void print() {
        System.out.println("Customer name: " + name);
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("Transaction " + Integer.toString(i) + ": " + transactions.get(i));
        }
    }
}


