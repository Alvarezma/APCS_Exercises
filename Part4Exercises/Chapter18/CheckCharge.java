import java.util.Scanner;

public class CheckCharge {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int checkBal, savBal;
        double servCharg;

        System.out.println("Enter balance in checking account: ");
        checkBal = scan.nextInt();

        System.out.println("Enter balance in saving account: ");
        savBal = scan.nextInt();

        if (checkBal >= 1000 || savBal >= 1500) {
            servCharg = 0.0;
        } else {
            servCharg = 0.15;
        }

        System.out.println("You have a service charge of $" + servCharg + " per check");

    }
}