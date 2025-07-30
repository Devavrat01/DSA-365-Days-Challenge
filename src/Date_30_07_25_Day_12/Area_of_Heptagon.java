package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Heptagon {
    public static void main(String[] args) {

        System.out.println("Enter the length of one side of the heptagon:");
        Scanner sc = new Scanner(System.in);
        double sideLength = sc.nextDouble();


        double area = (7.0 / 4.0) * sideLength * sideLength * (1.0 / Math.tan(Math.PI / 7.0));

        // Output the area
        System.out.println("The area of the heptagon is: " + area);
    }
}
