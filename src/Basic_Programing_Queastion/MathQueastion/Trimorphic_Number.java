package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Trimorphic_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cube = num*num*num;
        if(num==cube%10){
            System.out.println("Trimorphic NUmber");
        }
        else {
            System.out.println(" it not Trimorphic NUmber");
        }

    }
}
