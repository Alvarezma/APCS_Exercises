public class PerfectNumbers    {

    public static boolean Perfect( long num ) {
        long sum = 0;
        for (long i = 1; i < num; i++)  {
            if  (num % i == 0)  {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        } else  {
            return false;
        }
    }

    public static void main (String[] args )    {
        
        for (long i = 1; i <= 1000; i++) {
            if ( Perfect(i) )    {
                System.out.println( i + " is a perfect number" );
            }
        }
        
    }
}