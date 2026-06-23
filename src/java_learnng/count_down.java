package java_learnng;
import java.util.Scanner;

public class count_down {
    public  static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        while (num>0){
            System.out.println(num);
            num--;
        }
        System.out.println("We're here");
    }
}