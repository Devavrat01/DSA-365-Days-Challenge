package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp=num;
        int result=0;
        for(int i =1; i<=temp-1;i++){
            if (temp % i==0){

                result=result+i;
            }

        }
        System.out.println(result);
        if (result==num){
            System.out.println("It is Perfect number");
        }
        else {
            System.out.println("It is not perfect number");
        }


    }
}
