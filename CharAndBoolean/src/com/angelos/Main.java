package com.angelos;

public class Main {

    public static void main(String[] args) {
        //width of char 16 = (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        char registeredChar = '\u00AE';
        System.out.println("Registered symbol: " + registeredChar);
    }
}