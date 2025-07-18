package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+ ""+ b);
        for(int i =1; i<=num;i++){
            int c= a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;
        }
    }
}
