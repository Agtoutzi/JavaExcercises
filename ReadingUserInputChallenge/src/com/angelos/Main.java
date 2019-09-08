package com.angelos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int validNumbers = 1;
        while (validNumbers <= 10) {
            System.out.println("Enter number #" + validNumbers + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                validNumbers++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();

        }
        scanner.close();

        System.out.println("Sum of given numbers is: " + sum);
    }
}
