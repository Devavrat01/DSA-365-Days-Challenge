package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;
//  largest number like one number the largest number 9 and 2 number largest number 99 ...
public class Largest_Among_n_digit {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int result=0;
        for (int i=1;i<=num;i++){
            result = result*10 +9;
        }
        System.out.println(result);
// Static code for largest number
//           switch (num){
//               case 1:
//                   System.out.println("9");
//                   break;
//               case 2:
//                   System.out.println("99");
//
//               case 3:
//                   System.out.println("999");
//               case 4:
//                   System.out.println("9999");
//               case 5:
//                   System.out.println("99999");
//           }


    }
}
