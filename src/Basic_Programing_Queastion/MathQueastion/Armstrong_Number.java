package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tempforcount=num;
        int addnumber=num;
        int count=0;
        while (tempforcount>=1){
            count++;
            tempforcount/=10;

        }
        int result=0;
        for (int i=1; i<=count;i++)
        {
            int digit=addnumber%10;
            result= (int) (result+ (Math.pow(digit, count)));

            addnumber/=10;
        }
       if (result==num){
           System.out.println("Armstrong_Number");
       }
       else
       {
           System.out.println("It is not Armstrong number");
       }

    }
}

//package Basic_Programing_Queastion.MathQueastion;
//
//import java.util.Scanner;
//
//public class Armstrong_Number {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int number = scanner.nextInt();
//        scanner.close();
//
//        int temp = number;
//        int numDigits = 0;
//
//        // Count the number of digits
//        while (temp != 0) {
//            numDigits++;
//            temp /= 10;
//        }
//
//        int sum = 0;
//        int numCopy = number;
//
//        // Calculate the sum of the digits raised to the power of numDigits
//        while (numCopy != 0) {
//            int digit = numCopy % 10;
//            sum += Math.pow(digit, numDigits);
//            numCopy /= 10;
//        }
//
//        // Check if it's an Armstrong number
//        if (sum == number) {
//            System.out.println("Armstrong Number");
//        } else {
//            System.out.println("It is not an Armstrong number");
//        }
//    }
//}

