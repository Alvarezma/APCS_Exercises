import java.util.Scanner;

public class LogBase {

    public static void main ( String[] args ) {
        Scanner scan = new Scanner( System.in );

        double x;

        System.out.println("Enter a double: ");
        x = scan.nextDouble();


        double result = (Math.log(x))/(Math.log(2));

        System.out.println("Base 2 Log of " + x + " is " + result);
    }
}