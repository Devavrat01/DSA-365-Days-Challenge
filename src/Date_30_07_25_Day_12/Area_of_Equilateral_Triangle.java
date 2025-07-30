package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle:");
        int a = sc.nextInt();
        double Area = (Math.sqrt(3) / 4) * a * a;
        System.out.println(Area);


    }
}
