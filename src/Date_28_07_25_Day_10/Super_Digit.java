package Date_28_07_25_Day_10;

import java.util.Scanner;

public class Super_Digit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        int sum2=0;
       String str=Integer.toString(temp);
       int length=str.length();
        System.out.println(length);
       while(temp>0){
           int  digit= temp%10;
           sum=sum+digit;
           temp=temp/10;
       }
        int powerResult = (int) Math.pow(sum, length);

        // Step 3: Sum digits of the powered result
        int temp2 = powerResult;
        while (temp2 > 0) {
            sum2 += temp2 % 10;
            temp2 = temp2 / 10;
        }



        if (sum2 == length) {
            System.out.println("Super Digit");
        } else {
            System.out.println("It is not Super Digit");
        }

    }
}
