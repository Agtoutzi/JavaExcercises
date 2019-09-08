package com.angelos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }


    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                counter++;
                sum += scanner.nextInt();
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

        int average = 0;
        if (counter > 0) {
            average = (int) Math.round(((double) sum) / counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
