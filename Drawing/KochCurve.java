import java.awt.geom.Point2D;
import java.awt.Color;

public class KochCurve {
    private Point2D.Double point1;
    private Point2D.Double point2;
    private Color fill;

    public KochCurve(double point1_x, double point1_y, double point2_x, double point2_y, Color fill)    {
        point1 = new Point2D.Double(point1_x, point1_y);
        point2 = new Point2D.Double(point2_x, point2_y);
        this.fill = fill;
    }

    public void draw()  {
        StdDraw.setPenColor(fill);
        StdDraw.line(point1.x, point1.y, point2.x, point2.y);
    }

}