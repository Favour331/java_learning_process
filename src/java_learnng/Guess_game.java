package java_learnng;

import java.util.Scanner;
import java.util.Random;

public class Guess_game {
    public static void main(String args[]) {
        int score = 3;

        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(10) + 1;
        boolean hasWon = false;

        System.out.println("Guess the mystery number (between 1 and 10)");
        Scanner put = new Scanner(System.in);

        while (score > 0 && !hasWon) {
            System.out.println("Enter a number:");
            int num_bar = put.nextInt();

            if (num_bar == rand) {
                System.out.println("Hooray!!! You got it.");
                hasWon = true;
            } else if (num_bar < rand) {
                System.out.println("Number lower than mystery number.");
                score--;
                System.out.println("You have " + score + " entries left.");
            } else {
                System.out.println("Number higher than mystery number");
                score--;
                System.out.println("You have " + score + " entries left.");
            }
        }

        if (!hasWon) {
            System.out.println("Game Over! The mystery number was " + rand);
        }

        put.close();
    }
}