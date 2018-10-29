import java.util.*;

public class Exercise1  {

    public static void main ( String[] args )  {

        Scanner scan = new Scanner( System.in );
        int value = 10;
        int ammount = 0;

        Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );

        Pantry hubbard = new Pantry( goose, apple, rhub );
        
        System.out.println("Welcome to Mother Hubbard's Pantry!");
        System.out.println("The jams are:");
        System.out.println( hubbard );

        while ((value > 3 || value < -1) && value != 0) {
            System.out.println("Enter your selection (1, 2, or 3):");
            value = scan.nextInt();
            if ((value > 3 || value < -1) && value != 0)    {
                System.out.println("Please enter a valid input");
            }
        }
        
        while (value != -1)   {
            hubbard.select(value);

            System.out.println("Enter ammount to spread: ");
            ammount = scan.nextInt();

            hubbard.spread(ammount);

            System.out.println("The jams are:");
            System.out.println( hubbard );

            while ((value > 3 || value < -1) && value != 0) {
                System.out.println("Enter your selection (1, 2, or 3):");
                value = scan.nextInt();
                if ((value > 3 || value < -1) && value != 0)    {
                    System.out.println("Please enter a valid input");
                }
            }
        }


        System.out.println("Good-by");
    }
}