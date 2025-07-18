package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Automorphism_Number {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        boolean isAutomorphic = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println("Automorphism Number");
        } else {
            System.out.println("Not an Automorphism Number");
        }

        sc.close();
    }
}
