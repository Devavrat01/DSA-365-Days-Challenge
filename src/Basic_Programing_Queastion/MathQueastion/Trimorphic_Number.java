package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Trimorphic_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int cube = num * num * num;


        int digits = String.valueOf(num).length();


        int modulus = (int) Math.pow(10, digits);


        if (cube % modulus == num) {
            System.out.println("Trimorphic Number");
        } else {
            System.out.println("It is not a Trimorphic Number");
        }


    }

    }

