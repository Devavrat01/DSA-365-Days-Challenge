package Date_23_07_25_Day_5;

import java.util.Scanner;

public class All_Evil_Number_1_to_N {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int count = countOnesInBinary(i);
            if (count % 2 == 0) {
                System.out.println(i + " is an Evil number");
            }
        }
        sc.close();
    }


    public static int countOnesInBinary(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 2;
            n = n / 2;
        }
        return count;
    }
}
