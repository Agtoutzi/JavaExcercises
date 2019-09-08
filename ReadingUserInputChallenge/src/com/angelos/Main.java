package com.angelos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validNumbers = 0;
        int sum = 0;

        int i = 1;
        while (i <= 10) {
            System.out.println("Enter number #" + i + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                validNumbers++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();

            i++;
        }
        System.out.println("Sum of " + validNumbers + " valid numbers given is: " + sum);

        scanner.close();
    }
}
