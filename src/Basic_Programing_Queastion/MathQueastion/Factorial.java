package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result=1;
        for(int i=1; i<=num; i++){
            result = result*i;


        }
        System.out.println(result);
    }
}
