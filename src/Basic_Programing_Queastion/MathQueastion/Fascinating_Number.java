package Basic_Programing_Queastion.MathQueastion;

import javax.sound.midi.Soundbank;
import java.util.Scanner;



public class Fascinating_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp =num;
        boolean NumberTrue=false;
        int sum = temp*2;
        int multiple=temp*3;
        String string1= Integer.toString(temp);
        String string2= Integer.toString(sum);
        String string3= Integer.toString(multiple);
        String concateString=string1+string2+string3;//327654981
// check all number is 9 or not duplicate number
       for (int i=1;i<=concateString.length();i++){
           for (int j=1;j<=9;j++){
              if( j==concateString.charAt(i)){
                  NumberTrue=false;
                  break;
              }
           }

       }
       if (NumberTrue){
           System.out.println("It is fascinating number");
       }
       else {
           System.out.println("it is not fascinating");
       }

    }
}
