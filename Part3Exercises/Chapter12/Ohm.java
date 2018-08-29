import java.util.Scanner;

public class Ohm
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );

    int V, R;

    System.out.println("Imput the voltage: ");
    V = scan.nextInt();

    System.out.println("Imput the resistance: ");
    R = scan.nextInt();

    double I = (V + 0.0)/R;

    System.out.println("The current is: " + I);
  }
}