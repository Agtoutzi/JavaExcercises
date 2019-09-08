package com.angelos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                scanner.nextLine();
            } else {
                if (min != Integer.MAX_VALUE) {
                    System.out.println("The minimum given number is: " + min);
                    System.out.println("The maximum given number is: " + max);
                } else {
                    System.out.println("No valid numbers given");
                }
                break;
            }
        }
        scanner.close();
    }
}
