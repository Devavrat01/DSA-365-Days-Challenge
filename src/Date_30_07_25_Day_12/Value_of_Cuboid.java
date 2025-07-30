package Date_30_07_25_Day_12;

import java.util.Scanner;

public class Value_of_Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length , width and Height ");
        int length= sc.nextInt();
        int width= sc.nextInt();
        int height= sc.nextInt();
        int Volume=length*width*height;
        System.out.println("Value Of Cuboid :"+ Volume);
    }
}
