package Date_24_07_25_Day_6;

import java.util.Scanner;
import java.util.SortedMap;

public class Floyd_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=1;
       for (int i = 1; i<=num;i++){

           for (int j=1; j<=i;j++){

               System.out.print(count +"");
               count++;
           }

           System.out.println();

       }
    }
}
