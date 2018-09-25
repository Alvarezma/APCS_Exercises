import java.util.Scanner;

public class SumOfDivisors {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int n;
        int sum = 0;

        System.out.println("Enter Integer: ");
        n = scan.nextInt();
        
        for (int count = 1; count < n; count++) {
            if (n % count == 0) {
                sum = sum + count;
            }
        }

        System.out.println("Sum is: " + sum);
        if (sum == n)   {
            System.out.println( n + " is a perfect number");
        }
    }
}