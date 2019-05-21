package com.joshenglish;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount(1234, 0.00, "Josh English", "test email", "12345");
	    //account.setAccountNumber(1234);
	    System.out.println(account.getAccountNumber());
	    //account.setBalance(100.00);
	    System.out.println(account.getBalance());
	    //account.setEmail("test email");
	    System.out.println(account.getEmail());
	    //account.setName("Josh English");
	    System.out.println(account.getName());
	    //account.setPhoneNumber("12345");
	    System.out.println(account.getPhoneNumber());

	    account.printBalance();
	    account.makeDeposit(150.65);
	    account.makeWithdrawal(260);
	    account.makeWithdrawal(100);
    }
}
