package Date_25_07_25_Day_7;

import java.util.Scanner;

public class Power_of_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter Power");
        int pow= sc.nextInt();
        int i=1;
        int sum=1;

        while (i<=pow){
            sum=sum*num;
            i++;
        }
        System.out.println("\n " + num + " to power  " + pow+"  is  "+sum);


    }
}
