package com.company;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(String name) {
        branches.add(new Branch(name));
    }

    private int findBranchByName(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).name == name) {
                return i;
            }
        }
        return -1;
    }

    public void addCustomerToBranch(String customer, double initialTransaction, String branch) {
        int index = findBranchByName(branch);
        if (index != -1) {
            branches.get(index).addCustomer(customer, initialTransaction);
        }
        else {
            System.out.println("Could not find branch with name: " + branch);
        }
    }

    public void addTransactionToCustomerAtBranch(double transaction, String customer, String branch) {
        int index = findBranchByName(branch);
        if (index != -1) {
            branches.get(index).addTransactionForCustomer(customer, transaction);
        }
        else {
            System.out.println("Could not find branch with name: " + branch);
        }
    }

    public void print() {
        for (int i = 0; i < branches.size(); i++) {
            branches.get(i).print();
        }
    }
}
