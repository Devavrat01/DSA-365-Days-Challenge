package Date_01_08_25_Day_13.Java_Conversion_Programs;

import java.util.Scanner;

public class convert_int_to_String {
    public static void main(String[] args) {
        System.out.println("Enter The String ");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        String strNumber = String.valueOf(num);
        System.out.println(strNumber);
    }
}
