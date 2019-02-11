import java.awt.geom.Point2D;
import java.awt.Color;

public class H {
    private Point2D.Double center;
    private double relativeSize;
    private Color fill;

    public H(double center_x, double center_y, double relativeSize, Color fill)    {
        center = new Point2D.Double(center_x, center_y);
        this.relativeSize = relativeSize;
        this.fill = fill;
    }

    public void draw()  {
        StdDraw.setPenColor(fill);
        StdDraw.line(center.x - (relativeSize/2), center.y, center.x + (relativeSize/2), center.y);
        StdDraw.line(center.x - (relativeSize/2), center.y - (relativeSize/2), center.x - (relativeSize/2), center.y + (relativeSize/2));
        StdDraw.line(center.x + (relativeSize/2), center.y - (relativeSize/2), center.x + (relativeSize/2), center.y + (relativeSize/2));
    }

}