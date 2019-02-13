import java.awt.geom.Point2D;
import java.awt.Color;

public class KochSnowflake {
    private static KochCurve k;

    public static void main(String[] args)  {
        setup();

        fractal(1, 50, 50, 40);
    }

    public static void setup()  {

        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
    }

    public static void fractal(int times, double point1_x, double point1_y, double point2_x, double point2_y)   {
        if (times <= 0) {
            return;
        }
        k = new KochCurve(point1_x, point1_y, point2_x, point2_y, StdDraw.WHITE);
        k.draw();

        double height = Math.sqrt(Math.pow(point2_x - point1_x, 2) + Math.pow(point2_y - point1_y, 2))/6 * Math.sqrt(3);

        fractal(times - 1, center_x - relativeSize/2, center_y - relativeSize/2, relativeSize/2);
        fractal(times - 1, center_x - relativeSize/2, center_y + relativeSize/2, relativeSize/2);
        fractal(times - 1, center_x + relativeSize/2, center_y - relativeSize/2, relativeSize/2);
        fractal(times - 1, center_x + relativeSize/2, center_y + relativeSize/2, relativeSize/2);
        StdDraw.show();

    }

    
}