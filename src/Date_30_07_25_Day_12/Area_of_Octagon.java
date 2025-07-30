package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Octagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the length of one side of the octagon:");
        double a = sc.nextDouble();


        double area = 2 * (1 + Math.sqrt(2)) * Math.pow(a, 2);


        System.out.println("The area of the regular octagon is: " + area);


    }
}
