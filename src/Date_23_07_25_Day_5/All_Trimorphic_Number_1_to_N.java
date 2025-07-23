package Date_23_07_25_Day_5;

import java.util.Scanner;

public class All_Trimorphic_Number_1_to_N {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Trimorphic numbers from 1 to " + n + ":");
        for (int num = 1; num <= n; num++) {
            int cube = num * num * num;


            int digits = String.valueOf(num).length();


            int modulus = (int) Math.pow(10, digits);

            if (cube % modulus == num) {
                System.out.println(num);
            }
        }


    }
}
