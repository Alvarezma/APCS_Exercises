import java.io.* ;

class TwoLargest    {

    public static void main ( String[] args )  {

        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

        // declare and initialize variables for the two largest
        int largest = data[0];
        int secLargest = data[0];

        // compute the two largest
        for ( int index = 0; index < data.length; index++)    {
            if (data[index] >= largest)  {
                largest = data[index];
            } else if (data[index] >= secLargest)   {
                secLargest = data[index];
            }
        }
            
        // write out the two largest
        System.out.println( "1st: "  + largest + " 2nd: " + secLargest);

    }
}      