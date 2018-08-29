import java.util.Scanner;

public class FurSubFun
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );

    String str, sub;
    int b, e;

    System.out.println("Enter a string: ");
    str = scan.nextLine();

    System.out.println("Enter beginning index: ");
    b = scan.nextInt();

    System.out.println("Enter ending index: ");
    e = scan.nextInt();

    sub = str.substring(b, e);

    System.out.println("The original string: " + str);

    System.out.println("Substring: " + sub);
  }
}