import java.awt.geom.Point2D;
import java.awt.Color;

public class Triangle {
    private double[] x;
    private double[] y;
    private Color fill;

    public Triangle(double[] x, double[] y, Color fill)    {
        this.x = x;
        this.y = y;
        this.fill = fill;
    }

    public void draw()  {
        StdDraw.setPenColor(fill);
        StdDraw.filledPolygon(x, y);
    }

}