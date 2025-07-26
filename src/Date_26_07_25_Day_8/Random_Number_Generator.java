package Date_26_07_25_Day_8;

import java.util.Scanner;

public class Random_Number_Generator {
    public static void main(String[] args) {
        System.out.println("Enter the Number");

        int RandomNumber= (int) (Math.random() * 200) + 1;
        System.out.println(RandomNumber);
    }
}
