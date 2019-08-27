package com.company;

import java.util.ArrayList;

public class Branch {
    String name;
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(String customerName, double initialAmount)
    {
        this.customers.add(new Customer(customerName, initialAmount));
    }

    public void addTransactionForCustomer(String customerName, double transactionAmount) {
        int index = findCustomerByName(customerName);
        if (index != -1) {
            customers.get(index).addTransaction(transactionAmount);
        }
        else {
            System.out.println("Could not find customer named: " + customerName);
        }
    }

    private int findCustomerByName(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).name == customerName) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println("Branch: " + name);
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).print();
            System.out.println();
        }
    }
}
