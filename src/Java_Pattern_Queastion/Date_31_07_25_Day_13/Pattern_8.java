package Java_Pattern_Queastion.Date_31_07_25_Day_13;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int i=1;

        while (i<=num){
            int j=1;
            char jthColmun= (char)('A'+i-1);
            while (j<=i){

                System.out.print(jthColmun);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
