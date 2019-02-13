import java.awt.geom.Point2D;
import java.awt.Color;

public class SquareFractal {
    private static Square s;
    private static int form;

    public static void main(String[] args)  {
        setup();

        fractal(2, 50, 50, 30, StdDraw.WHITE);
    }

    public static void setup()  {

        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
    }

    public static void fractal(int times, double center_x, double center_y, double relativeSize, Color fill)   {
        if (times <= 0) {
            return;
        }
        form = 2;
    
        fractal(times - 1, center_x + relativeSize, center_y + relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        fractal(times - 1, center_x + relativeSize, center_y - relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        fractal(times - 1, center_x - relativeSize, center_y - relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        fractal(times - 1, center_x - relativeSize, center_y + relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);

        s = new Square(center_x, center_y, relativeSize, fill);
        s.draw();
        // s.draw();
        // if(form != 1)   {
        //     if (form == 2)  {
        //         fractal(times - 1, center_x + relativeSize, center_y + relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        //         fractal(times - 1, center_x - relativeSize, center_y - relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        //         fractal(times - 1, center_x - relativeSize, center_y + relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        //     } else if (form == 3)   {
        //         fractal(times - 1, center_x + relativeSize, center_y - relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        //         fractal(times - 1, center_x - relativeSize, center_y + relativeSize, relativeSize/2, StdDraw.LIGHT_GRAY);
        //     }
        // }
        StdDraw.show();



    }

    
}