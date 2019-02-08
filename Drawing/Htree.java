import java.awt.geom.Point2D;
import java.awt.Color;

public class Htree {
    private static H h;

    public static void main(String[] args)  {
        setup();

        while(true) {
            loop();
        }
    }

    public static void setup()  {

        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();

        h = new H(50, 50, 10, StdDraw.WHITE);
    }

    public static void loop()   {
        StdDraw.clear(StdDraw.GRAY);

        h.draw();

        StdDraw.show();
    }

    
}