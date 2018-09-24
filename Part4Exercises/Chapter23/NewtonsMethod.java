import java.util.Scanner;

public class NewtonsMethod {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        final double firstGuess = 0.0001;
        double denominator;
        double guess = firstGuess;
        double difference = 1;

        System.out.println("Enter Denominator: ");
        denominator = scan.nextDouble();
        
        if (denominator <= 0)    {
            System.out.println("Error Denominator needs to be positive and not zero");
        } else if (1 / denominator <= firstGuess)  {
            System.out.println("Error Denominator too large");
        } else    {       
            while ( difference > 0.000001 )  {
                difference = guess;
                guess = guess * (2 - (denominator * guess));
                difference = guess - difference;
            }

            System.out.println("1/" + denominator + " is about " + guess);       
        }

    }
}