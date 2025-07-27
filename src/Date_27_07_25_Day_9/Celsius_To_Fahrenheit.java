package Date_27_07_25_Day_9;

import java.util.Scanner;

public class Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        System.out.println("Celsius_To_Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double celsius= sc.nextInt();
      double   F = celsius * 9/5 + 32;
        System.out.println(F);
    }

}
