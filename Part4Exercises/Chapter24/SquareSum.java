import java.util.Scanner;

public class SquareSum {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int n;
        boolean sumOfSquares = false;


        System.out.println("Enter Integer: ");
        n = scan.nextInt();
        
        for (int a = 0; (a * a) <= n; a++)    {
            if (a * a == n) {
                sumOfSquares = true;
            }
            for (int b = 0; (a * a) + (b * b) <= n; b++)    {
                if ((a * a) + (b * b) == n) {
                    sumOfSquares = true;
                }
            }
        }

        if (sumOfSquares)   {
            System.out.println(n + " is the sum of two squared integers");
        } else  {
            System.out.println(n + " is NOT the sum of two squared integers");
        }
    }
}