import java.util.Scanner;

public class OrderCheck {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        final int bp = 5;
        final int np = 3;
        final int wp = 1;

        int b, n, w;

        System.out.println("Number of bolts: ");
        b = scan.nextInt();

        System.out.println("Number of nuts: ");
        n = scan.nextInt();

        System.out.println("Number of washers: ");
        w = scan.nextInt();

        if ( n >= b && w >= (b * 2)) {
            System.out.println("Order is OK");
        } else {
            if ( n < b ) {
                System.out.println("Too few nuts");
            }
            if ( w < ( b * 2 ) ) {
                System.out.println("Too few washers");
            }
        }

        int cost = (b * bp) + (n * np) + (w * wp);

        System.out.println("Total cost: " + cost);
    }
}