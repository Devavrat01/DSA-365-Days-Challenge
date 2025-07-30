package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        System.out.println(" Enter The area of Triangle ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base ");
        int b = sc.nextInt();
        System.out.println("Enter The Height ");
        int h=sc.nextInt();

        double Area = 0.5 * b * h;

        System.out.println(Area);

    }
}
