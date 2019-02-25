import java.awt.geom.Point2D;
import java.awt.Color;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;

public class BouncingBall {
    private Point2D.Double min, max;
    private Ball ball;

    public static void main(String[] args)  {
        BouncingBall bball = new BouncingBall();
    }

    public BouncingBall()   {
        setup();

        while(true) {
            loop();
        }
    }

    public void setup()  {
        min = new Point2D.Double(0, 0);
        max = new Point2D.Double(100, 100);

        StdDraw.setXscale(min.x, max.x);
        StdDraw.setYscale(min.y, max.y);
        StdDraw.enableDoubleBuffering();

        ball = new ResizingBall(50, 50, 10, StdDraw.WHITE);
    }

    public void loop()   {
        StdDraw.clear(StdDraw.GRAY);

        ball.draw();

        StdDraw.show();

        ball.update(min, max);
    }

    // public void mouseExited(MouseEvent e)    {
        
    // }
    
    // public void mouseEntered(MouseEvent e)    {

    // }

    // public void mouseReleased(MouseEvent e)    {

    // }

    // public void mousePressed(MouseEvent e)    {

    // }

    // public void mouseClicked(MouseEvent e)    {
    //     System.out.println("click");
    // }

    
}