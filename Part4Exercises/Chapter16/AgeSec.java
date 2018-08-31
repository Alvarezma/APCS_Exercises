import java.util.Scanner;

public class AgeSec {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int y, m, d;;
        int s;

        System.out.println("Enter Years: ");
        y = scan.nextInt();

        System.out.println("Enter Months: ");
        m = scan.nextInt();

        System.out.println("Enter Days: ");
        d = scan.nextInt();

        d = d + (y * 365);

        if (m >= 1) {
            d = d + 31;
        }
        if (m >= 2) {
            d = d + 28;
        }
        if (m >= 3) {
            d = d + 31;
        }
        if (m >= 4) {
            d = d + 30;
        }
        if (m >= 5) {
            d = d + 31;
        }
        if (m >= 6) {
            d = d + 30;
        }
        if (m >= 7) {
            d = d + 31;
        }
        if (m >= 8) {
            d = d + 31;
        }
        if (m >= 9) {
            d = d + 30;
        }
        if (m >= 10) {
            d = d + 31;
        }
        if (m == 11) {
            d = d + 30;
        }

        s = (d * 24 * 60 * 60);
        double p = (s + 0.0) / (2500000000.0) * 100;

        System.out.println("Your Age in Seconds: " + s);
        System.out.println("Percent of your lifespan: " + p);

    }
}