public class Trim
{
  public static void main ( String[] args )
  {
    String first = new String("    L o l    ");
    String second;

    second = first.trim();

    System.out.println(first);
    System.out.println(second);
  }
}