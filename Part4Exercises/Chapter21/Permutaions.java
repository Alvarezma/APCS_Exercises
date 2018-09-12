import java.util.Scanner;

public class Permutaions {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int n, r;
        int result = 1;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        System.out.println("Enter R: ");
        r = scan.nextInt();

        int denom = n - r;

        if (r < 0 || n < 0) {
            System.out.println("Error negative inputs not allowed");
        } else  {
            while (n > denom) {
                result = result * n;
                n = n - 1;
            }
            System.out.println("Number of permutations: " + result);
        }
    }
}