package Date_21_07_25_Day_3;

import java.util.Scanner;

public class All_Fascenating_Number_1_to_N {

    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Fascinating numbers from 100 to " + num + " are:");

        for (int i = 100; i <= num; i++) {
            if (isFascinating(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isFascinating(int n) {
        if (n < 100) {
            return false;
        }

        int multiply1 = n * 2;
        int multiply2 = n * 3;

        String concatenated = "" + n + multiply1 + multiply2;

        if (concatenated.length() != 9) {
            return false;
        }

        int[] digitCount = new int[10];

        for (int i = 0; i < concatenated.length(); i++) {
            int digit = concatenated.charAt(i) - '0';
            digitCount[digit]++;
            if (digitCount[digit] > 1) {
                return false; // Duplicate digit
            }
        }

        // Ensure digits 1–9 appear exactly once
        for (int i = 1; i <= 9; i++) {
            if (digitCount[i] != 1) {
                return false;
            }
        }

        return true;
    }
}
