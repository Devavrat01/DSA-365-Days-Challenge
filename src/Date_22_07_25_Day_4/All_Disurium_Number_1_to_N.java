package Date_22_07_25_Day_4;

import java.util.Scanner;

public class All_Disurium_Number_1_to_N {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        System.out.println("Disarium numbers from 1 to " + limit + ":");

        for (int num = 1; num <= limit; num++) {
            if (isDisarium(num)) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }

    public static boolean isDisarium(int number) {
        String str = Integer.toString(number);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            sum += Math.pow(digit, i + 1);
        }

        return sum == number;
    }
}
