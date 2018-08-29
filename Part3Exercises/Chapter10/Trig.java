public class Trig
{
    public static void main ( String[] args ) {
        double degrees = 30;

        double rad = degrees * Math.PI/180;

        double sinx = Math.sin( rad );
        double cosx = Math.cos( rad );

        double sum = (cosx * cosx) + (sinx * sinx);

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
    }
}