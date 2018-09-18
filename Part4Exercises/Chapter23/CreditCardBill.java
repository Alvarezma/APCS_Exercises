import java.util.Scanner;
import java.text.*;

public class CreditCardBill {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );
        DecimalFormat numform = new DecimalFormat(); 

        double balance;
        double interest;
        double monthlyPay;
        int month = 0;

        System.out.println("Balance unpaid: ");
        balance = scan.nextDouble();

        System.out.println("Monthly Interest: ");
        interest = (scan.nextDouble())/100;

        System.out.println("Montly payment: ");
        monthlyPay = scan.nextDouble();

        while ( balance > 0 )  {
            balance = balance + (balance * interest);
            balance = balance - monthlyPay;

            month = month + 1;
            if (balance < 0)    {
                balance = 0;
            }
            System.out.println("Month: " + month + " balance: " + numform.format(balance) + " total payments: " + (month * monthlyPay));
        }

    }
}