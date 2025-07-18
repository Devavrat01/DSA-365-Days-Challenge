package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

// num= 9 => condition1->num*num,9*9=81 , condition2-> result= 8+1= num
public class Neon_Number {
    public static void main(String[] args) {
        System.out.println("Enter the any number number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num;
        int multply= temp*temp;
        int result=0;
        System.out.println(multply);
       while (multply>0){
           int digit= multply%10;
           result= result+digit;
           multply=multply/10;
       }
        System.out.println(result);
       if(result==num){
           System.out.println("Neon Number");
       }
       else {
           System.out.println("It is  not Neon Number");
       }

    }
}
