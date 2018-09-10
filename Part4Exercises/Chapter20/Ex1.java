import java.util.Scanner;

public class Ex1 {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int times, integer;
        int count = 0;
        int sum = 0;

        System.out.println("How many integers will be added: ");
        times = scan.nextInt();


        while (count < times)    {
            System.out.println("Enter an integer: ");
            integer = scan.nextInt();

            sum = sum + integer;

            count = count + 1;
        }

        System.out.println("The sum is " + sum);

    }
}