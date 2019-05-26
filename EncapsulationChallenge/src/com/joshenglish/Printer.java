package com.joshenglish;

public class Printer {
    private int tonerLevel;
    private int numPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    private void printTonerLevel() {
        System.out.println("New toner level is " + tonerLevel);
    }

    public void fillToner(int amount) {
        tonerLevel = tonerLevel + amount > 100 ? 100 : tonerLevel + amount;
        printTonerLevel();
    }

    public void printPage() {
        if(isDuplex) {
            if(tonerLevel >= 2) {
                tonerLevel -= 2;
                numPagesPrinted += 2;
                System.out.println("Printing double sided.");
                printTonerLevel();
            } else {
                System.out.println("Printing failed, out of toner.");
            }
        } else {
            if(tonerLevel >= 1) {
                tonerLevel--;
                numPagesPrinted++;
                System.out.println("Printing single sided.");
                printTonerLevel();
            } else {
                System.out.println("Printing failed, out of toner.");
            }
        }
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }
}
