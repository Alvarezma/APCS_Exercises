public class SubString
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    int len = str.length();

    String sub = str.substring(8,len); //create a new object from the original

    System.out.println( sub );

  }
}
