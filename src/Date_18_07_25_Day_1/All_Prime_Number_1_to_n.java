package Date_18_07_25_Day_1;

import java.util.Scanner;

public class All_Prime_Number_1_to_n {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        for (int i = 1; i<=num;i++){
            int Count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    Count++;
                }
            }
           if (Count==2){
               System.out.println(i);
           }

        }

    }
}
