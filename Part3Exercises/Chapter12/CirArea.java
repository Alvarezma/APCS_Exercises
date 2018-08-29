import java.util.Scanner;

public class CirArea
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );

    int r;
    double area;

    System.out.println("Imput the radius: ");
    r = scan.nextInt();

    area = (r*r*Math.PI);

    System.out.println("The radius is: " + r + " The area is: " + area);
  }
}