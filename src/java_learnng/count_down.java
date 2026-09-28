package java_learnng;
import java.util.Scanner;

public class count_down {
    static void new_method(){
        System.out.println("I just got here");
    }
    public  static void main(String [] args){
        Scanner put = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = put.nextInt();
        while (num>0){
            System.out.println(num);
            num--;
        }
        System.out.println("We're here");
        new_method();
    }
}