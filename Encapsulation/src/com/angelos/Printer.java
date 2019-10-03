package com.angelos;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerPercent) {
        if (this.tonerLevel + tonerPercent > 100) {
            System.out.println("Cannot add so much toner.");
        } else {
            this.tonerLevel += tonerPercent;
            System.out.println("Toner filled at " + this.tonerLevel + "%");
        }
    }

    public void printPages(int pages) {
        if (tonerLevel - pages * 0.1 < 0) {
            System.out.println("Not enough toner to print " + pages + " pages!");
            return;
        }
        if (this.isDuplex) {
            this.pagesPrinted += (int) Math.ceil(pages / 2D);
            System.out.println("Printing duplex pages...");
            System.out.println("Printed " + (int) Math.ceil(pages / 2D) + " pages. Total printed is: " + this.pagesPrinted);
        } else {
            this.pagesPrinted += pages;
            System.out.println("Printing single pages...");
            System.out.println("Printed " + pages + " pages. Total printed is: " + this.pagesPrinted);
        }
        this.tonerLevel -= pages * 0.1;
        System.out.println("Toner percent remaining: " + this.tonerLevel + "%");
    }

    public void checkTonner() {
        System.out.println("Toner level is: " + this.tonerLevel + "%");
    }
}
