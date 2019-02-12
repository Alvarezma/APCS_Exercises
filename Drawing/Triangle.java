import java.awt.geom.Point2D;
import java.awt.Color;

public class Triangle {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;
    private Color fill;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3, Color fill)    {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.fill = fill;
    }

    public void draw()  {
        StdDraw.setPenColor(fill);
        double[] x = {x1, x2, x3};
        double[] y = {y1, y2, y3};
        StdDraw.filledPolygon(x, y);
    }

}