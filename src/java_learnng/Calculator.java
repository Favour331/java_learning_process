package java_learnng;
import java.util.Scanner;

public class Calculator {
    static void multi(int first, int sec){
        int ans = first * sec;
        System.out.println("The multiplication of " + first +" by "+ sec + " is " + ans);
    }
    static void div(int first, int sec){
        if (sec == 0){
            System.out.println("Error!! Cannot divide by zero");
        }else {
            int ans = first / sec;
            System.out.println("The division of " + first + " by " + sec + " is " + ans);
        }
    }
    static void plus(int first, int sec){
        int ans = first + sec;
        System.out.println("The addition of " + first +" and "+ sec + " is " + ans);
    }
    static void minus(int first, int sec){
        int ans = first - sec;
        System.out.println("The subtraction of " + sec +" from "+ first + " is " + ans);
    }
    public static void main(String args[]){
        System.out.println("Calculator");
        boolean running = true;
        Scanner can = new Scanner(System.in);
        while (running) {
            System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division.Enter 5 to quit");
            int choice = can.nextInt();
            if (choice == 5){
                System.out.println("Bye!!");
                running = false;
            }else if (choice >= 1 && choice <= 4){
                System.out.println("Enter the first number");
                int put = can.nextInt();

                System.out.println("Enter second number");
                int ond = can.nextInt();

                if (choice == 1) {
                    plus(put, ond);
                } else if (choice == 2) {
                    minus(put, ond);
                } else if (choice == 3) {
                    multi(put, ond);
                } else if (choice == 4) {
                    div(put, ond);
                }
            }else{
                System.out.println("Invalid output!! Please enter a number between 1 and 5");
            }
        }
        can.close();
    }
}
