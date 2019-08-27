package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank();
	    bank.addBranch("Phoenix");
	    bank.addCustomerToBranch("Josh", 10.1, "Phoenix");
	    bank.print();
	    bank.addTransactionToCustomerAtBranch(1.22, "Josh", "Phoenix");
	    bank.print();
	    bank.addTransactionToCustomerAtBranch(1.22, "Jose", "Tempe");
	    bank.addTransactionToCustomerAtBranch(1.33, "Jose", "Phoenix");
    	bank.addBranch("Tempe");
    	bank.addCustomerToBranch("Jose", 11.1, "Tempe");
    	bank.print();
    }
}
