import java.util.Scanner;

public class PowerNum {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int n;
        double x;
        double result = 1;
        int count = 0;

        System.out.println("Enter X: ");
        x = scan.nextDouble();

        System.out.println("Enter N: ");
        n = scan.nextInt();

        while (count < n)   {
            result = result * x;

            count = count + 1;
        }

        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}