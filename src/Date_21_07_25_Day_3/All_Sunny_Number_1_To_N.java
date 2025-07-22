package Date_21_07_25_Day_3;

import java.util.Scanner;

public class All_Sunny_Number_1_To_N {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sunny Numbers from 1 to " + num + " are:");
        for (int i = 1; i <= num; i++) {
            int temp = num;
            boolean sunny_True = false;

            for (int j = 1; j <= i; j++) {
                int Sunny = i + 1;
                int result = j * j;
                if (result == Sunny) {
                    sunny_True = true;
                    break;
                }
            }
            if (sunny_True) {
                System.out.print(i + " ");
            }
        }

    }
}
