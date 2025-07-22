package Date_22_07_25_Day_4;

import java.util.Scanner;

public class All_Pronic_Number_1_to_N {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int j = 1; j <= num; j++) {
            boolean checkPronic = false;
            for (int n = 0; n <= j; n++) {
                if (j == n * (n + 1)) {

                    checkPronic = true;

                }


            }
            if (checkPronic) {
                System.out.println(j);
            }

        }

    }
}
