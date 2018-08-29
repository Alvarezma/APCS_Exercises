import java.util.Scanner;

public class DiscPrices {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int p;
        double disc = 0.10;
        double discp;

        System.out.println("Enter ammount of purchases (In cents): ");
        p = scan.nextInt();

        if ( p > 1000 ) {
            discp = p - ( p * disc );
            System.out.println("Your discounted price (In cents): " + discp);
        } else {
            System.out.println("Your price (In cents): " + p);
        }
    }
}