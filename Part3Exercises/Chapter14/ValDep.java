import java.util.Scanner;
import java.text.*;

public class ValDep {
    public static void main (String[] args) {
        Scanner scan = new Scanner( System.in );

        DecimalFormat valform = new DecimalFormat("$000.00");

        double P, r, n, t;
        
        System.out.println("Initial deposit: ");
        P = scan.nextDouble();

        System.out.println("Interest rate: ");
        r = scan.nextDouble();

        System.out.println("Times per year: ");
        n = scan.nextDouble();

        System.out.println("Number of years: ");
        t = scan.nextDouble();

        double V = (Math.pow(1 + (r/n), n * t)) * P;

        System.out.println("Value: " + valform.format(V));
    }
}