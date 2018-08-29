import java.util.Scanner;
import java.lang.Math;

public class WindChill {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        double v, temp, Chill;

        System.out.println("Enter Wind Speed: ");
        v = scan.nextDouble();

        System.out.println("Enter Temperature: ");
        temp = scan.nextDouble();

        if (v <= 3 || temp >= 50) {
            System.out.println("Wind Chill: " + temp);
        } else {
            Chill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * temp * Math.pow(v, 0.16));
            System.out.println("Wind Chill: " + Chill);
        }
    }
}