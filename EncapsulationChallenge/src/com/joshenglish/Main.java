package com.joshenglish;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Printer printer = new Printer(50, false);
        printer.fillToner(10);
        printer.printPage();
        printer.getNumPagesPrinted();

        System.out.println();
        Printer duplex = new Printer(70, true);
        duplex.fillToner(40);
        duplex.printPage();
        duplex.getNumPagesPrinted();
    }
}
