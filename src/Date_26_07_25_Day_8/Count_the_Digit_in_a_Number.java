package Date_26_07_25_Day_8;

import java.util.Scanner;

public class Count_the_Digit_in_a_Number {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        while (num>0){
            num= num/10;
            count++;

        }
        System.out.println(" Total Digit is:"+count);

    }
}
