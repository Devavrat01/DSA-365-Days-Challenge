package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Evil_odious_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int result =0;


        for (int i=1; i<=num;i++){
            int binary_number= temp%2;
            result =result*10+binary_number;
            temp =temp/2;

        }

        System.out.println(result);

    }
}