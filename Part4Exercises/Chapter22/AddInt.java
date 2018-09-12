import java.util.Scanner;

public class AddInt {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int num;
        int sum = 0;

        System.out.println("Enter first integer (enter 0 to quit): ");
        num = scan.nextInt();

        if (num != 0)   {
            while (num != 0)    {
                sum = sum + num;

                System.out.println("Enter an integer (enter 0 to quit): ");
                num = scan.nextInt();
            }
            System.out.println("The sum is " + sum);

        } else {
            System.out.println("No integers where entered.");
        }

        System.out.println("bye ;)");

    }
}