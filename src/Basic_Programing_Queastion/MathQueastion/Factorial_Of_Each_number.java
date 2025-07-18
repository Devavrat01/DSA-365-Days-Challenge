package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Factorial_Of_Each_number {
    public static void main(String[] args) {
        System.out.println("Enter The Number ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1; i<=num;i++){
            int fact= 1;
            for ( int j = 1; j<=i;j++){
                fact = fact*j;

            }
            System.out.println( fact);
        }

    }
}
