package Date_27_07_25_Day_9;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        System.out.println("Celsius_To_Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }
}
