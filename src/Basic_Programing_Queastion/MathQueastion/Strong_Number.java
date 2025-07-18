package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

// check the number strong number  or not
 //1! + 4! + 5! = 1 + 24 + 120 = 145
public class Strong_Number {
    public static void main(String[] args) {
        System.out.println("Enter the any  number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num;
//        int factorial=1;
        int result=0;
       while(temp>0){

            int digit = temp%10;
            int factorial=1;
             for (int j=1; j<=digit;j++){

                  factorial =factorial*j;
             }
            result=result+factorial;
             temp=temp/10;
        }
        if(result==num){
            System.out.println("Strong number");
        }
        else {
            System.out.println("It is not Strong number");
        }

        sc.close();

    }
}
