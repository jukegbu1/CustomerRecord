import java.util.Scanner;

public class CustomerRecord {
        public static void main (String [] args){

            Scanner keyboard = new Scanner (System.in);

            System.out.println("Enter customer name");
            String name = keyboard.nextLine();

            System.out.println("Enter Purchase Amount");
            double amount = keyboard.nextDouble();

            System.out.println("Get Tax Code");
            int taxCode = keyboard.nextInt();


            double taxPercentage = 0;

            if(taxCode == 0) {taxPercentage = 0;}
            else if
            ( taxCode == 1) {taxPercentage =0.03; }
            else if
            ( taxCode == 2) {taxPercentage =0.05;}
            else if
            ( taxCode == 3) {taxPercentage =0.07;}

            double salesTax= (taxPercentage/100)* (amount);
            double TotalAmountDue= salesTax + amount;

            System.out.println("customer name = " + name + "\nTaxPercentage " + taxPercentage +
                    "\namount " + amount + "\nsalesTax " + salesTax +"\nTotalAmount " + TotalAmountDue

            );

        }
    }

