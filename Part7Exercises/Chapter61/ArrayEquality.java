import java.util.Arrays;

class ArrayEquality
{
    public static boolean myEquals( int[] a, int[] b )  {
        boolean equal = true;
        for (int i = 0; i < a.length; i++)  {
            if (a[i] != b[i])   {
                equal = false;
            }
        }
        return equal;
    }

    public static void main ( String[] args )   {
        int[] arrayA = { 1, 2, 3, 4 };
        int[] arrayB = { 1, 2, 3, 4 };

        System.out.print("Arrays says: ");
        if ( Arrays.equals(arrayA, arrayB ) )    {
            System.out.println( "Equal" );
        } else  {
            System.out.println( "NOT Equal" );      
        }

        System.out.print("myEquals says: ");
        if ( ArrayEquality.myEquals( arrayA, arrayB ) )    {
            System.out.println( "Equal" );
        } else  {
            System.out.println( "NOT Equal" );      
        }
    }
}