import java.util.Scanner;

public class BirthDayParadox {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int n;
        double chance = 1.0;
        boolean found = false;
        int numberOfGuests = 0;


        System.out.println("Enter number of guests: ");
        n = scan.nextInt();
        
        for (int count = 1; count <= n; count++) {
            chance = chance * ((365 - (n - 1.0)) / 365.0);
            if (chance < 0.50 && !found)    {
                numberOfGuests = count;
                found = true;
            }
        }

        System.out.println("At " + numberOfGuests + " there is a 50% chance of someone sharing a birthday");
        System.out.println("There is a " + (chance * 100) + " percent chance they do not share a birthday");
    }
}