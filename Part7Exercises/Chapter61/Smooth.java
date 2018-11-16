import java.io.* ;

class Smooth    {

    public static void main ( String[] args )  {

        int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
        int[] smooth = new int[signal.length];

        // compute the smoothed value for each
        //  cell of the array smooth
        smooth[0]  =  (int)((1.0 * signal[0] + signal[1]) / 2);
        smooth[ signal.length-1 ] = (int)((1.0 * signal[signal.length-2] + signal[signal.length-1]) / 2);
        for ( int i = 1; i < signal.length - 1; i++ )   {
            smooth[i] = (int)((1.0 * signal[i - 1] + signal[i] + signal[i + 1]) / 3);
        }
            
        // write out the input
        System.out.println("Signal: ");
        for ( int j=0; j < smooth.length; j++)  {
            System.out.print(signal[j] + " ");
        }
        System.out.println("");
        // write out the result
        System.out.println("Smooth: ");
        for ( int j=0; j < smooth.length; j++)  {
            System.out.print(smooth[j] + " ");
        }

    }
}      