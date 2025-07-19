package Date_19_07_25_Day_2;

import java.util.Scanner;
import java.util.HashSet;

public class  All_Happy_Number_1_to_N{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (N):");
        int n = sc.nextInt();

        System.out.println("Happy Numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isHappy(int num) {
        HashSet<Integer> seen = new HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = sumOfSquares(num);
        }
        return num == 1;
    }


    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
