import java.util.Scanner;

public class HarMean {

    public static void main ( String[] args ) {
        Scanner scan = new Scanner( System.in );

        double x ,y;

        System.out.println("Enter X: ");
        x = scan.nextDouble();

        System.out.println("Enter Y: ");
        y = scan.nextDouble();

        double A = (x + y) / 2.0;

        double H = 2 / (1/x + 1/y);

        System.out.println("Arithmetic mean: " + A);
        System.out.println("Harmonic mean: " + H);
    }
}