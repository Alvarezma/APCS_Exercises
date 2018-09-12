import java.util.Scanner;

public class MilPerGal {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int ini = 0;
        int fin, gal;
        double mpg = 0.0;

        while (ini >= 0)    {
            System.out.println("Initial Miles: ");
            ini = scan.nextInt();

            if (ini >= 0)    {
                System.out.println("Final Miles: ");
                fin = scan.nextInt();

                System.out.println("Gallons: ");
                gal = scan.nextInt();

                mpg = (fin - ini)/(gal * 1.0);

                System.out.println("Miles per Gallon: " + mpg);
            }

        }
        System.out.println("bye ;)");

    }
}