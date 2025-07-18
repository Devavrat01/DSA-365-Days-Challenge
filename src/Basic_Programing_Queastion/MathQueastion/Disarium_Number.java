package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Disarium_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String str = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum += Math.pow(digit, i + 1);
        }

        System.out.println("Sum of digits powered to their positions: " + sum);

        if (sum == num) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is NOT a Disarium number.");
        }
    }
}
