import java.awt.geom.Point2D;
import java.awt.Color;

public class ResizingBall extends Ball    {


    public ResizingBall(double center_x, double center_y, double radius, Color fill)   {
        super(center_x, center_y, radius, fill);
    }

    public void hitWall()   {
        setRadius(getRadius() + 1.0);
    }
}