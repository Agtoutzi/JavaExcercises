package com.angelos;

public class Main {

    public static void main(String[] args) {
        byte b = 123;
        short s = 4567;
        int i = 8901234;
        long l = 50000L + 10L * (b + s + i);
        short totalShort = (short) (50000L + 10L * (b + s + i));

        System.out.println("final long number = " + l);
        System.out.println("final short number = " + totalShort);
    }
}
