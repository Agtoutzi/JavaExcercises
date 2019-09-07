package com.angelos;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("*********************");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("*********************");
        int primes = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                primes++;
                if (primes == 10) {
                    System.out.println("Exiting for loop");
                    System.out.println("Hello,\nworld");
                    break;
                }
            }
        }

        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum+=i;
                System.out.println(i);
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}