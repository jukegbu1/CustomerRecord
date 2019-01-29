import java.util.Scanner;

public class BasicApplication {
        public static void main (String [] args){

            Scanner Keyboard = new Scanner (System.in);
            int num;
            System.out.println("Enter a number:");
             num= Keyboard.nextInt();
             num= num + 5;
             num= num*2;
             num= num-7;

            System.out.println(num);


        }
    }

