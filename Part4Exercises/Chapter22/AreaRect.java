import java.util.Scanner;

public class AreaRect {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int x1, x2, y1, y2;
        int width = 1;
        int height = 1;
        int area;

        while (height > 0 && width > 0)    {
            System.out.println("First corner X Coordinate: ");
            x1 = scan.nextInt();

            System.out.println("First corner Y Coordinate: ");
            y1 = scan.nextInt();

            System.out.println("Second corner X Coordinate: ");
            x2 = scan.nextInt();

            System.out.println("Second corner Y Coordinate: ");
            y2 = scan.nextInt();

            if (x1 <= x2)   {
                width = x2 - x1;
            } else {
                width = x1 - x2;
            }

            if (y1 <= y2)   {
                height = y2 - y1;
            } else {
                height = y1 - y2;
            }

            area = width * height;

            System.out.println("Width: " + width + " Height: " + height + " Area: " + area);

        }
        System.out.println("Finished");

    }
}