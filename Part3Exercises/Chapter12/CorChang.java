import java.util.Scanner;

public class CorChang
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );

    int cen;
    int dol, q, d, n;

    System.out.println("How much change in cents: ");
    cen = scan.nextInt();

    dol = cen / 100;
    cen = cen % 100;
    q = cen / 25;
    cen = cen % 25;
    d = cen / 10;
    cen = cen % 10;
    n = cen / 5;
    cen = cen % 5;

    System.out.println("Your change is: " + dol + " dollar, " + q + " quarters, " + d + " dime, " + n + " nickels, and " + cen + " cents");
  }
}