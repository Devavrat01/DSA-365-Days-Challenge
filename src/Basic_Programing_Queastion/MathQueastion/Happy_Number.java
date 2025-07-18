package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;

public class Happy_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int sumsquare=0;
        boolean is_happy=false;
      int   square=temp*temp;
      while (square>0){
          int digit= square%10;
          sumsquare = (int) (sumsquare+Math.pow(digit, 2));
          if (sumsquare==1){
              is_happy=true;
              break;
          }
          square=square/10;


      }
        square=sumsquare;
      square=97; // how to second time loop think then solve the question

      if (is_happy){
          System.out.println("It is happy");
      }
      else {
          System.out.println("It is not happy");
      }
    }
}
