import java.awt.geom.Point2D;
import java.awt.Color;

public class TriangleFractal {
    private static Triangle t;

    public static void main(String[] args)  {
        setup();

        fractal(8, 25, 50, 75, 50, 0, 50);
    }

    public static void setup()  {

        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
        t = new Triangle(0, 50, 100, 0, 100, 0, StdDraw.WHITE);
        t.draw();
        StdDraw.show();
    }

    public static void fractal(int times, double x1, double x2, double x3, double y1, double y2, double y3)   {
        if (times <= 0) {
            return;
        }

        t = new Triangle(x1, x2, x3, y1, y2, y3, StdDraw.BLACK);
        t.draw();

        fractal(times - 1, x1 - ((x2 - x1)/2), x1, x1 + ((x2 - x1)/2), y2 + ((y1 - y2)/2), y2, y2 + ((y1 - y2)/2));
        fractal(times - 1, x1 + ((x2 - x1)/2), x2, x3 - ((x2 - x1)/2), y1 + ((y1 - y2)/2), y1, y1 + ((y1 - y2)/2));
        fractal(times - 1, x3 - ((x2 - x1)/2), x3, x3 + ((x2 - x1)/2), y2 + ((y1 - y2)/2), y2, y2 + ((y1 - y2)/2));
        StdDraw.show();

    }

    
}