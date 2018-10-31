public class UnluckyEvilNumbers    {

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
        if (searching)  {
            return false;
        } else  {
            return unLuck;
        }
    }

    public static boolean Evil( long num ) {
        int numOfOnes = 0;
        while (num != 0)    {
            if (num % 2 == 1)   {
                numOfOnes++;
            }
            num = num / 2;
        }
        if (numOfOnes % 2 == 1) {
            return false;
        } else  {
            return true;
        }
    }

    public static void main (String[] args )    {
        
        for (long i = 1; i <= 1000; i++) {
            if ( Evil(i) && Unlucky(i) )    {
                System.out.println( i + " is both a Evil and Unlucky number" );
            }
        }
        
    }
}