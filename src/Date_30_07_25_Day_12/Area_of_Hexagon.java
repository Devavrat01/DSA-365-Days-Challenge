package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Hexagon {
    public static void main(String[] args) {
        System.out.println("Enter the Length");
        Scanner sc = new Scanner(System.in);
        int length= sc.nextInt();
        double Area=(3*Math.sqrt(3)/2)*length*length;
        System.out.println("The area of the hexagon is: " + Area);
    }
}
