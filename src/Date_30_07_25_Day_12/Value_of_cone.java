package Date_30_07_25_Day_12;

import java.util.HashMap;
import java.util.Scanner;

public class Value_of_cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height");
        Double radius= (double) sc.nextInt();
        Double height= (double) sc.nextInt();
       Double Volume=(1.0/3.0)*Math.PI*radius*radius* height;
        System.out.println(Volume);

    }
}
