public class PantryTester   {
    public static void main ( String[] args ) {
        Jam goose = new Jam( "Gooseberry", "7/4/86", 4 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 1 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 2 );

        //          Test 1
        // Pantry hubbard = new Pantry( goose, apple, rhub );
        // System.out.println( hubbard );

        // hubbard.select(1);
        // hubbard.spread(2);
        // System.out.println( hubbard );

        // hubbard.select(3);
        // hubbard.spread(4);
        // System.out.println( hubbard );


        //          Test 2
        // Pantry hubbard2 = new Pantry( goose, apple );

        // System.out.println( hubbard2 );

        // if ( hubbard2.select(1) )    {
        //     hubbard2.spread(2);
        // }   else    {
        //     System.out.println("Selection not available");
        // }

        // System.out.println( hubbard2 );

        // if ( hubbard2.select(3) )    {
        //     hubbard2.spread(5);
        // } else  {
        //     System.out.println("Selection not available");
        // }

        // System.out.println( hubbard2 );

        //          Test 3
        // Pantry hubbard3 = new Pantry( goose, apple );
        // System.out.println( hubbard3 );

        // if ( hubbard3.select(3) )    {
        //     hubbard3.spread(2);
        // }   else    {
        //     System.out.println("Selection not available");
        // }
        // System.out.println( hubbard3 );

        // hubbard3.replace( rhub, 3 );
        // System.out.println( hubbard3 );

        // if ( hubbard3.select(3) )    {
        //     hubbard3.spread(2);
        // }   else    {
        //     System.out.println("Selection not available");
        // }
        // System.out.println( hubbard3 );

        //          Test 4
        Pantry hubbard4 = new Pantry( goose, apple, rhub );
        System.out.println( hubbard4 );

        if ( hubbard4.select(1) )    {
            hubbard4.spread(2);
        }   else    {
            System.out.println("Selection not available");
        }
        System.out.println( hubbard4 );

        hubbard4.mixedFruit();
        System.out.println( hubbard4 );

    }
}