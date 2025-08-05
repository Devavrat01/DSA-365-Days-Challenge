package Java_Pattern_Queastion.Date_31_07_25_Day_13;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            char startChar = (char) ('A' + num - i);

            for (char ch = startChar; ch <= 'A' + num - 1; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
