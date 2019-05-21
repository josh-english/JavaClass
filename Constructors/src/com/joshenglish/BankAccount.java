package com.joshenglish;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printBalance() {
        System.out.println(name + "'s balance is: " + this.balance);
    }

    public void makeDeposit(double amount) {
        System.out.println("Depositing $" + amount + " to " + name + "'s account.");
        this.balance += amount;
        this.printBalance();
    }

    public void makeWithdrawal(double amount) {
        if(this.balance < amount) {
            System.out.println("Insufficient Funds");
            this.printBalance();
        } else {
            System.out.println("Withdrawing $" + amount + " from " + name + "'s account.");
            this.balance -= amount;
            this.printBalance();
        }
    }

}
