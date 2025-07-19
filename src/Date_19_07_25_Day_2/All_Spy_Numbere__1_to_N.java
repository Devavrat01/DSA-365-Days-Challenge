package Date_19_07_25_Day_2;

import java.util.Scanner;

public class All_Spy_Numbere__1_to_N {

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

for (int i =1; i<=num;i++) {
    int temp=i;

    int sum= 0;
    int multiply=1;

    while (temp > 0) {
        int digit = temp % 10;
        sum = sum + digit;
        multiply = multiply * digit;

        temp = temp / 10;
    }
    if (sum == multiply) {
        System.out.println(i);
    }
}

    }
}
