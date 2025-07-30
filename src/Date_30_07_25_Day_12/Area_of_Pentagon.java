package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Pentagon {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of one side of the Pentagon:");
        int a = sc.nextInt();
        double factor = Math.sqrt(5 * (5 + 2 * Math.sqrt(5)));
        double Area = (1.0 / 4.0) * factor * a * a;
        System.out.println("The area of the pentagon is: " + Area);

    }
}
