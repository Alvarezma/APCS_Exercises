import java.awt.geom.Point2D;
import java.awt.Color;

public class Htree {
    private static H h;

    public static void main(String[] args)  {
        setup();

        fractal(8, 50, 50, 40);
    }

    public static void setup()  {

        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
    }

    public static void fractal(int times, double center_x, double center_y, double relativeSize)   {
        if (times <= 0) {
            return;
        }
        h = new H(center_x, center_y, relativeSize, StdDraw.WHITE);
        h.draw();

        fractal(times - 1, center_x - relativeSize/2, center_y - relativeSize/2, relativeSize/2);
        fractal(times - 1, center_x - relativeSize/2, center_y + relativeSize/2, relativeSize/2);
        fractal(times - 1, center_x + relativeSize/2, center_y - relativeSize/2, relativeSize/2);
        fractal(times - 1, center_x + relativeSize/2, center_y + relativeSize/2, relativeSize/2);
        StdDraw.show();

    }

    
}