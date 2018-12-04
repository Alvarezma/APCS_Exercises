import java.io.* ;

public class ColSums    {

    public static void main ( String[] args )     {
        int[][] data = { {3, 2, 5},
                            {1, 4, 4, 8, 13},
                            {9, 1, 0, 2},
                            {0, 2, 6, 3, -1, -8} };

        int biggest = 0;

        for ( int row = 0; row < data.length; row++)  {
            if (biggest < data[row].length) {
                biggest = data[row].length;
            }
        }

        int sum;

        for ( int col = 0; col < biggest; col++)  {
            sum = 0;
            
            for ( int row = 0; row < data.length; row++)    {
                if (col < data[row].length) {
                    sum += data[row][col];
                }
            }
            
            System.out.println( "For collumn " + col + " the sum = " + sum);
        }
            
    }
}      