package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Pronic_number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        boolean checkPronic=false;
        for(int n=0; n<=num; n++){
            if(num==n*(n+1)){

                checkPronic=true;

            }


        }
        if (checkPronic){
            System.out.println("It is Pronic  number");
        }
        else {
            System.out.println("It is not  Pronic  number");
        }




    }
}
