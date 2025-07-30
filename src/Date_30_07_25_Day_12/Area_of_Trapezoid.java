package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Area_of_Trapezoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter b1 and b2 are the lengths of the two parallel sides (bases)");
        int b1= sc.nextInt();
        int b2=sc.nextInt();
        System.out.println("Enter the Height");
        int h = sc.nextInt();

        double Area= 0.5*(b1+b2)*h;
        System.out.println(Area);
    }
}
