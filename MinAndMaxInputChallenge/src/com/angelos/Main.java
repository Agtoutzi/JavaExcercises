package com.angelos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (first) {
                    first=false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                scanner.nextLine();
            } else {
                break;
            }
        }
        scanner.close();

        if (!first) {
            System.out.println("The minimum given number is: " + min);
            System.out.println("The maximum given number is: " + max);
        } else {
            System.out.println("No valid numbers given");
        }
    }
}
