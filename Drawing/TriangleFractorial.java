import java.awt.geom.Point2D;
import java.awt.Color;

public class TriangleFactorial {
    private static Trangle t;
    private static double[] x;
    private static double[] y;

    public static void main(String[] args)  {
        setup();

        // fractal(1, {0, 50, 100}, {0, 100, 0});
    }

    public static void setup()  {

        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledPolygon({0, 50, 100}, {0, 100, 0});
    }

    public static void fractal(int times, double[] x, double[] y)   {
        if (times <= 0) {
            return;
        }
        t = new Triangle(x, y, StdDraw.WHITE);
        h.draw();

        fractal(times - 1, , );
        fractal(times - 1, , );
        fractal(times - 1, , );
        StdDraw.show();

    }

    
}