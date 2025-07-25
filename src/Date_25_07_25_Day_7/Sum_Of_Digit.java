package Date_25_07_25_Day_7;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Sum_Of_Digit {

    public static void main(String[] args) {
        System.out.println("Enter The Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;


        while (num>0){
            int digit = num%10;
            sum= sum+digit;
            num=num/10;
        }
        System.out.println(sum);

    }
}
