import java.util.Scanner;
import java.lang.Math;

public class MatMovie {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int age, time;
        int price = 0;

        System.out.println("Enter Age: ");
        age = scan.nextInt();

        System.out.println("Enter Time(24 hour): ");
        time = scan.nextInt();

        if (age >= 13 && time < 1700) {
            price = 5;
        } else if (age >= 13) {
            price = 8;
        } else if (age < 13 && time < 1700) {
            price = 2;
        } else if (age < 13) {
            price = 4;
        }

        System.out.println("Your ticket price is: " + price);
    }
}