package Date_01_08_25_Day_13.Java_Conversion_Programs;

import java.util.Scanner;

public class Convert_String_to_int_in_Java {
    public static void main(String[] args) {
        System.out.println("Enter The String ");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        int  num= Integer.parseInt(str);
        System.out.println(num);
    }
}
