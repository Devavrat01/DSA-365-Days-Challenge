package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp=num;
        int temp2=num;

        int reverse=0;

        int count=0;
        while(temp2>=1){
            count++;
            temp2=temp2/10;
        }
        System.out.println(count);

        for (int i =1; count>=i; i++){
            int digit= temp%10;
            reverse = reverse*10+digit;
            temp=temp/10;
        }

        if(reverse==num){
            System.out.println("It is Palindrome number");
        }
        else {
            System.out.println("It is not Palindrome Number");
        }
    }
}
