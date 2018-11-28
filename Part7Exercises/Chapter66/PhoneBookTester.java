import java.util.Scanner;

public class PhoneBookTester    {
    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        PhoneBook pb = new PhoneBook();  

        // search for "Violet Smith"
        int input = -1
        while   (input != 0)    {
            System.out.println("" );
            System.out.println("Choose action: enter integer to choose(0 to quit)\n 1. Search\n2. Add\n3. Delete" );
            input = scan.nextInt();
            if  (input == 1)    {
                searching();
            } else if  (input == 2)    {
                adding();
            } else if  (input == 3)    {
                deleting();
            }
        }
    }

    public void searching() {
        String targetLast = "a";
        String targetFirst = "";
        
        System.out.println("" );
        System.out.println("Last Name?   " );
        targetLast = scan.nextLine().toUpperCase();

        System.out.println("First Name?   " );
        targetFirst = scan.nextLine().toUpperCase();

        if (targetFirst.trim().length() > 0)    {
            PhoneEntry entry = pb.search( targetFirst, targetLast ); 
            
            if ( entry != null )    {
                System.out.println( "The number is: " + entry.getPhone() );
            } else {
                System.out.println("Name not found" );
            }
        } else  {
            pb.search( targetLast ); 
        }
    }

    public void adding()    {
        added = true;
        
        System.out.println("add First name" );
        first = scan.nextLine();
        System.out.println("add Last name" );
        last = scan.nextLine();
        System.out.println("add number" );
        number = scan.nextLine();

        for (int i = 0; i < pb.length; i++)  {
            if (pb[i] == null)  {
                pb[i] = new PhoneEntry(first, last, number);
                System.out.println("Entry was Added" );
            }
        }
    }
}