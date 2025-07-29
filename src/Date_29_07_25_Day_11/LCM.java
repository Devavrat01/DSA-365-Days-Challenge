package Date_29_07_25_Day_11;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers");
        Scanner  sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
    int lcm=(a>b)?a:b;
    while (true){
        if (lcm%a==0 && lcm%b==0){
            System.out.println("Lcm a Entered Number:"+ lcm);
            break;
        }
        ++lcm;
    }

    }
}
