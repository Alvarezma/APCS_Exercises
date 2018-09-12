import java.util.Scanner;

public class InRangeAdd {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int num, low, high;
        int sumIn = 0;
        int sumOut = 0;

        System.out.println("Low end of range: ");
        low = scan.nextInt();

        System.out.println("High end of range: ");
        high = scan.nextInt();

        System.out.println("Enter Data (0 to quit): ");
        num = scan.nextInt();

        if (num != 0)   {
            while (num != 0)    {
                if (num >= low && num <= high)  {
                    sumIn = sumIn + num;
                } else  {
                    sumOut = sumOut + num;
                }

                System.out.println("Enter Data: ");
                num = scan.nextInt();
            }
            System.out.println("Sum of in range values: " + sumIn);
            System.out.println("Sum of out of range values: " + sumOut);

        } else {
            System.out.println("No integers were entered.");
        }

        System.out.println("bye ;)");

    }
}