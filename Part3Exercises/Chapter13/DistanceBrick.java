import java.util.Scanner;

public class DistanceBrick {

    public static void main ( String[] args ) {
        Scanner scan = new Scanner( System.in );

        double g = 32.174;
        float t;

        System.out.println("Enter the number of seconds: ");
        t = scan.nextFloat();


        double dist = ((t * t) * g)/2;

        System.out.println("Distance: " + dist);
    }
}