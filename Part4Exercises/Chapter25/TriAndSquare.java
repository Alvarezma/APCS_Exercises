import java.util.Scanner;

public class TriAndSquare {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int upperLimit;
        boolean square, tri;

        System.out.println("Enter upper limit: ");
        upperLimit = scan.nextInt();

        for (double num = 1.0; num <= upperLimit; num++)   {
            int sum = 0;
            square = false;
            tri = false;
            if ((Math.sqrt(num)) % 1 == 0)    {
                square = true;
            }
            for (int a = 1; sum <= num; a++)    {
                sum = sum + a;
                if (sum == num) {
                    tri = true;
                }
            }
            if (square && tri)  {
                System.out.println(num + " is both a square and triangle number");
            }
        }
        
        System.out.println("Bye");
    }
}