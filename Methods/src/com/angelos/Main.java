package com.angelos;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

        String playerName;
        int playerScore;

        playerName = "George";
        playerScore = 1500;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));

        playerName = "John";
        playerScore = 900;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));

        playerName = "Jack";
        playerScore = 400;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));

        playerName = "Bill";
        playerScore = 50;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
////            return 1;
////        } else if(playerScore >= 500) {
////            return 2;
////        } else if(playerScore >= 100) {
////            return 3;
////        }
////
////        return 4;
        int position = 4;  // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking) {
            return (hourOfDay >= 0 && hourOfDay < 8) ||
                    (hourOfDay > 22 && hourOfDay <= 23);
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        return (int) (number1 * 1000) == (int) (number2 * 1000);
    }

    public static boolean hasEqualSum(int number1, int number2, int number3) {
        return number1 + number2 == number3;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);
    }

}
