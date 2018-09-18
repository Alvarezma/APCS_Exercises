import java.util.Scanner;

public class MillionDollars {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        double dollars;
        double interest;
        double addYear;
        int year = 0;

        System.out.println("Enter inititial investment: ");
        dollars = scan.nextDouble();

        System.out.println("Enter interest rate: ");
        interest = scan.nextDouble();

        System.out.println("Enter yearly contribution: ");
        addYear = scan.nextDouble();

        while ( dollars < 1000000.00 )  {
            dollars = dollars + (dollars * interest);
            dollars = dollars + addYear;

            year = year + 1;
        }

        System.out.println("It took " + year + " years to reach your goal.");

    }
}