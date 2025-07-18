package Basic_Programing_Queastion.MathQueastion;

import java.util.Scanner;
//Take the number num=15 then add the 1 original number then check number is  Perfect square number
//if perfect square the  it is sunny number but It is not perfect square Number the It is not sunny number
public class Sunny_Number {
    public static void main(String[] args) {
        System.out.println("Enter the any Number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int succeedingNO=num+1;
        boolean perfects=false;
        for (int i=1; i<=succeedingNO/2;i++){
            int p=i*i;
            if (p==succeedingNO){
            perfects=true;
            break;
            }
        }
        if (perfects){
            System.out.println("It is sunny number");
        }
        else {
            System.out.println("It is not Sunny number");
        }
    }
}
