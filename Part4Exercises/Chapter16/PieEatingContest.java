import java.util.Scanner;

public class PieEatingContest {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int weight;

        System.out.println("Enter your weight: ");
        weight = scan.nextInt();

        if (weight >= 250 - 30 && weight <= 250 + 30) {
            System.out.println("You can compete");
        } else {
            System.out.println("You can not compete");
        }
    }
}