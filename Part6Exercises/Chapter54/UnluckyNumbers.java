import  java.util.Scanner;

public class UnluckyNumbers    {

    public static boolean Unlucky( long num ) {
        boolean unLuck = false;
        boolean searching = true;
        while (num != 0)    {
            if (searching)  {
                if (num % 10 == 3)   {
                    unLuck = true;
                } else if (num % 10 == 1 && unLuck) {
                    unLuck = true;
                    searching = false;
                } else {
                    unLuck = false;
                }
            }
            num = num / 10;
        }
        return unLuck;
    }

    public static void main (String[] args )    {
        Scanner scan = new Scanner( System.in );
        long num; 

        System.out.println( "To exit, enter a negative value" );
        System.out.print( "Enter a positive integer: " );
        num = scan.nextLong();

        while ( num >= 0 )  {
            if (Unlucky( num ))  {
                System.out.println( num + " is unlucky" );
            } else  {
                System.out.println( num + " is safe" );
            }

            System.out.print( "Enter a positive integer: " );
            num = scan.nextInt();
        }
        
    }
}