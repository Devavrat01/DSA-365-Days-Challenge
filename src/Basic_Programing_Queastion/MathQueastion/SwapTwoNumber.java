package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
       int a=5;
       int b=6;
        System.out.println(" before swap:"+a+""+b);
       int c=b;
           b=a;
           a=c;

        System.out.println("AFTER SWAP: "+a+""+b);



    }
}
