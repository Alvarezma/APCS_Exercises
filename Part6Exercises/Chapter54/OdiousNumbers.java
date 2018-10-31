import  java.util.Scanner;

public class OdiousNumbers    {

    public static boolean Odious( long num ) {
        int numOfOnes = 0;
        while (num != 0)    {
            if (num % 2 == 1)   {
                numOfOnes++;
            }
            num = num / 2;
        }
        if (numOfOnes % 2 == 1) {
            return true;
        } else  {
            return false;
        }
    }

    public static void main (String[] args )    {
        Scanner scan = new Scanner( System.in );
        long num; 

        System.out.println( "To exit, enter a negative value" );
        System.out.print( "Enter a positive integer: " );
        num = scan.nextLong();

        while ( num >= 0 )  {
            if (Odious( num ))  {
                System.out.println( num + " is a odious number" );
            } else  {
                System.out.println( num + " is not an odious number" );
            }

            System.out.print( "Enter a positive integer: " );
            num = scan.nextInt();
        }
        
    }
}