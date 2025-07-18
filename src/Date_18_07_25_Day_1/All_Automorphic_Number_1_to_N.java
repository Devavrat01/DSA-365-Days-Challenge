package Date_18_07_25_Day_1;

import java.util.Scanner;

public class All_Automorphic_Number_1_to_N {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {
            int square = i * i;
            int temp = i;
            boolean isAutomorphic = true;


            while (temp > 0) {
                if (temp % 10 != square % 10) {
                    isAutomorphic = false;
                    break;
                }
                temp /= 10;
                square /= 10;
            }


            if (isAutomorphic) {
                System.out.println(i + " is an Automorphic Number");
            }
        }
    }
}
