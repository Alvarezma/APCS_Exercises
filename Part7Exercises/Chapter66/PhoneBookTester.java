import java.util.Scanner;

public class PhoneBookTester    {
    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        PhoneBook pb = new PhoneBook();  

        String targetLast = "fuck";
        String targetFirst = "";

        // search for "Violet Smith"
        int input = -1;
        while   (input != 0)    {
            System.out.println("" );
            System.out.println("Choose action: enter integer to choose(0 to quit)\n1. Search\n2. Add\n3. Delete" );
            input = scan.nextInt();
            if  (input == 1)    {
                System.out.println("" );
                System.out.println("Last Name?   " );
                targetLast = scan.nextLine().toUpperCase();
                System.out.println(targetLast );

                System.out.println("First Name?   " );
                targetFirst = scan.nextLine().toUpperCase();
                System.out.println(targetFirst );

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
            // else if  (input == 2)    {
            //     adding(pb, scan);
            // } else if  (input == 3)    {
            //     deleting(pb, scan);
            // }
        }
    }

    // public static void searching(PhoneBook pb, Scanner scan) {

    //     System.out.println("" );
    //     System.out.println("Last Name?   " );
    //     String targetLast = scan.nextLine().toUpperCase();

    //     System.out.println("First Name?   " );
    //     String targetFirst = scan.nextLine().toUpperCase();

    //     if (targetFirst.trim().length() > 0)    {
    //         PhoneEntry entry = pb.search( targetFirst, targetLast ); 
            
    //         if ( entry != null )    {
    //             System.out.println( "The number is: " + entry.getPhone() );
    //         } else {
    //             System.out.println("Name not found" );
    //         }
    //     } else  {
    //         pb.search( targetLast ); 
    //     }
    // }

    // public static void adding(PhoneBook pb, Scanner scan)    {
        
    //     System.out.println("add First name" );
    //     String first = scan.nextLine();
    //     System.out.println("add Last name" );
    //     String last = scan.nextLine();
    //     System.out.println("add number" );
    //     String number = scan.nextLine();

        
    //     boolean added = pb.add(first, last, number);

    //     if (added)  {
    //         System.out.println("Entry was Added" );
    //     } else  {
    //         System.out.println("Failed no room for new entries" );
    //     }
    // }

    // public static void deleting(PhoneBook pb, Scanner scan)    {
        
    //     System.out.println("" );
    //     System.out.println("Last Name?   " );
    //     String targetLast = scan.nextLine().toUpperCase();

    //     System.out.println("First Name?   " );
    //     String targetFirst = scan.nextLine().toUpperCase();

    //     PhoneEntry entry = pb.search( targetFirst, targetLast ); 

    //     if ( entry != null )    {
    //         entry = null;
    //         System.out.println( "Entry deleted" );
    //     } else {
    //         System.out.println("Entry not found" );
    //     }
    // }
}