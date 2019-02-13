import java.awt.geom.Point2D;
import java.awt.Color;

public class Square {
    private Point2D.Double center;
    private double relativeSize;
    private Color fill;

    public Square(double center_x, double center_y, double relativeSize, Color fill)    {
        center = new Point2D.Double(center_x, center_y);
        this.relativeSize = relativeSize;
        this.fill = fill;
    }

    public void draw()  {
        StdDraw.setPenColor(fill);
        StdDraw.filledSquare(center.x, center.y, relativeSize);
    }

}