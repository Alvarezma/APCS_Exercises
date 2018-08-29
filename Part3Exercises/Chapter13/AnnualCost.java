import java.util.Scanner;

public class AnnualCost
{
  public static void main ( String[] args ) {
  Scanner scan = new Scanner( System.in );

  float cph;
  int h;

  System.out.println("Enter cost per kilowatt-hour in cents: ");
  cph = scan.nextFloat();

  System.out.println("Enter kilowatt-hours used per year: ");
  h = scan.nextInt();

  double cost = (cph * h)/100;

  System.out.println("Annual cost: " + cost);
  }
}