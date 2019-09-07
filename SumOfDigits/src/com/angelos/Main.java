package com.angelos;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstLastDigit(-1));
        System.out.println(sumFirstLastDigit(2));
        System.out.println(sumFirstLastDigit(8));
        System.out.println(sumFirstLastDigit(10));
        System.out.println(sumFirstLastDigit(125));
        System.out.println(sumFirstLastDigit(121));
        System.out.println(sumFirstLastDigit(123454321));
        System.out.println(sumFirstLastDigit(222));
        System.out.println(sumFirstLastDigit(-222));
        System.out.println(hasSameLastDigit(11, 22, 31));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }

        return sum;
    }

    public static boolean isPalindrome(int number) {
        int temp = number > 0 ? number : -number;
        if (temp / 10 == 0) {
            return true;
        }
        int reverse = 0;
        while (temp > 0) {
            reverse = (reverse * 10) + temp % 10;
            temp /= 10;
        }
        return number == reverse || number == -reverse;
    }

    public static int sumFirstLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return firstDigit + number;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        while (number1 > 0) {
            int temp2 = number2;
            while (temp2 > 0) {
                if (number1 % 10 == temp2 % 10) {
                    return true;
                }
                temp2 /= 10;
            }
            number1 /= 10;
        }

        return false;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }

        return n1 % 10 == n2 % 10 || n1 % 10 == n3 % 10 || n2 % 10 == n3 % 10;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int smaller = first < second ? first : second;
        int greatestDivisor = 1;
        for (int i = 2; i <= smaller; i++) {
            if (first % i == 0 && second % i == 0 ) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }
}
