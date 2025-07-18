package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num%4==0 && num%100!=0) || (num%400==0)){
            System.out.println("It is leap year");
        }
        else {
            System.out.println("It is not leap year");
        }
    }
}
