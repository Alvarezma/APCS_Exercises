import java.util.Scanner;

public class CenDollar
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );

    int cen, dol;

    System.out.println("Imput the cents: ");
    cen = scan.nextInt();

    dol = cen / 100;
    cen = cen % 100;

    System.out.println("That is " + dol + " dollars and " + cen + " cents");
  }
}