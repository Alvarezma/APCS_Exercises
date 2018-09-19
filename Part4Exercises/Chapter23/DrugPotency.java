import java.util.Scanner;

public class DrugPotency {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        double effectiveness = 100.0;
        double loss = .04;
        int month = 0;

        while ( effectiveness > 50.0 )  {
            System.out.println("Month: " + month + "    effectiveness: " + effectiveness);
            effectiveness = effectiveness - (effectiveness * loss);

            month++;
        }

        System.out.print("Month: " + month + "    effectiveness: " + effectiveness + " DISCARDED");

    }
}