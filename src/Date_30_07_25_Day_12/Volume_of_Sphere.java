package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Volume_of_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere.");
        int r= sc.nextInt();
        double Volume= (4.0/3.0)*Math.PI*Math.pow(r,3);
        System.out.println("Volume of a Sphere "+ Volume);
    }
}
