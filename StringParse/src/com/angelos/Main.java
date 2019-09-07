package com.angelos;

public class Main {

    public static void main(String[] args) {
//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,11));
//        System.out.println(canPack(-3,2,12));

//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
        for (int i = 0; i < 15; i++) {
            printSquareStar(i);
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = 0; i < bigCount && goal >= 5; i++) {
            goal -= 5;
        }

        for (int i = 0; i < smallCount && goal >= 1; i++) {
            goal -= 1;
        }
        return goal == 0;
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = 2;
        for (int i = largestPrime; i <= number; i++) {
            if (number % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 ||
                        j == 0 || j == number - 1 ||
                        i == j || i == number - 1 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
