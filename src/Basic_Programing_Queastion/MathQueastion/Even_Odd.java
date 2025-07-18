package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Even_Odd {
    public  static  void main(String [] agrs){
        System.out.println("Check number is even or odd");
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
