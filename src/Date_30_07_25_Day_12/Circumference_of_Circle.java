package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Circumference_of_Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle:");
        Scanner sc = new Scanner(System.in);
        int  r=sc.nextInt();
        double Circumference = 2 * Math.PI * r;
        System.out.println("The circumference of the circle is: " + Circumference);
    }
}
