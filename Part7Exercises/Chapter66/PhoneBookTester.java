import java.util.Scanner;

public class PhoneBookTester    {
    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        PhoneBook pb = new PhoneBook();  

        String last = "fuck";
        String first = "";

        String input = "";
        while   (!input.equals("QUIT"))    {

            System.out.println("" );
            System.out.println("last Name?   " );
            last = scan.nextLine().toUpperCase();
            System.out.println(last );

            System.out.println("first Name?   " );
            first = scan.nextLine().toUpperCase();
            System.out.println(first );


            System.out.println("" );
            System.out.println("Choose action: \nenter entire word to choose(type quit to quit)\n1. Search\n2. Add\n3. Delete" );
            input = scan.nextLine().toUpperCase();

            if  (input.equals("SEARCH"))    {

                if (first.trim().length() > 0)    {
                    PhoneEntry entry = pb.search( first, last ); 
                    
                    if ( entry != null )    {
                        System.out.println( "The number is: " + entry.getPhone() );
                    } else {
                        System.out.println("Name not found" );
                    }
                } else  {
                    pb.search( last ); 
                }
            } 
            else if  (input.equals("ADD"))    {
                System.out.println("" );
                System.out.println("Give number to complete Phone Entry" );
                String number = scan.nextLine();

                
                boolean added = pb.add(first, last, number);

                if (added)  {
                    System.out.println("Entry was Added" );
                } else  {
                    System.out.println("Failed: no room for new entries" );
                }
            } else if  (input.equals("DELETE"))    {

                boolean deleted = pb.delete( first, last ); 

                if ( deleted )    {
                    System.out.println( "Entry deleted" );
                } else {
                    System.out.println("Entry not found" );
                }
            } else  {
                System.out.println("No option was chosen");
            }
        }
    }
}