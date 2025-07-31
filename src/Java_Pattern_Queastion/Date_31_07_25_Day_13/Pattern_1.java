package Java_Pattern_Queastion.Date_31_07_25_Day_13;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();
        for (int i=1; i<=num;i++){

            for (int j=1;j<=num;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
