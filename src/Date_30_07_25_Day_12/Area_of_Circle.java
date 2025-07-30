package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}
