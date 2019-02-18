import java.awt.geom.Point2D;
import java.awt.Color;

public class KochSnowflake {
    private static KochCurve k;

    public static void main(String[] args)  {
        setup();

        fractal(4, 1, 30, 40, 50, 70);
        fractal(4, 1, 50, 70, 70, 40);
        fractal(4, -1, 30, 40, 70, 40);
    }

    public static void setup()  {

        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
    }

    public static void fractal(int times, int direction, double point1_x, double point1_y, double point2_x, double point2_y)   {
        if (times <= 0) {
            return;
        }
        k = new KochCurve(point1_x, point1_y, point2_x, point2_y, StdDraw.WHITE);

        double height = Math.sqrt(Math.pow(point2_x - point1_x, 2) + Math.pow(point2_y - point1_y, 2))/6 * Math.sqrt(3);
        double slope = -1/((point2_y - point1_y)/(point2_x - point1_x));
        double shift_x = Math.sqrt(Math.pow(height, 2)/(Math.pow(slope, 2) + 1)) * direction;
        double shift_y = Math.sqrt(Math.pow(height, 2)/((1/Math.pow(slope, 2)) + 1)) * direction;

        if (point1_y < point2_y)    {
            shift_x *= -1;
        }
        if (point1_x > point2_x)    {
            shift_y *= -1;
        }

        fractal(times - 1, direction, point1_x, point1_y, (point2_x - point1_x)/3 + point1_x, (point2_y - point1_y)/3 + point1_y);
        fractal(times - 1, direction, (point2_x - point1_x)/3 + point1_x, (point2_y - point1_y)/3 + point1_y, (point2_x - point1_x)/2 + point1_x + shift_x, (point2_y - point1_y)/2 + point1_y + shift_y);
        fractal(times - 1, direction, (point2_x - point1_x)/2 + point1_x + shift_x, (point2_y - point1_y)/2 + point1_y + shift_y, point2_x - (point2_x - point1_x)/3, point2_y - (point2_y - point1_y)/3);
        fractal(times - 1, direction,point2_x - (point2_x - point1_x)/3, point2_y - (point2_y - point1_y)/3, point2_x, point2_y);
        k.draw();

        StdDraw.show();

    }

    
}