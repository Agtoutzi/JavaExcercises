package com.angelos;

public class Main {

    public static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(200, 32));
        System.out.println(getDurationString(200 * 60 + 32));
        System.out.println(getDurationString(-1, 10));
        System.out.println(getDurationString(100, -10));
        System.out.println(getDurationString(-20));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE;
        }
        long hours = minutes / 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = minutes % 60 + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return getDurationString(-1, -1);
        }
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1D;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1D;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String minutesString = minutes + " min";

        long years = minutes / 525600;
        String yearsString = years + " y";

        long days = (minutes - years * 525600) / (60 * 24);
        String daysString = days + " d";

        System.out.println(minutesString + " = " + yearsString + " and " + daysString);
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && c != a) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }
}
