import java.util.Scanner;
import java.text.*;

public class DoubVal {
    public static void main (String[] args) {
        Scanner scan = new Scanner( System.in );

        DecimalFormat timeform = new DecimalFormat("000.0");

        double r, t;
        
        System.out.println("Interest rate: ");
        r = scan.nextDouble();

        t = 72.0 / (100 * r);

        System.out.println("Years to double: " + timeform.format(t));
    }
}