import java.util.Scanner;

public class Ex2 {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int times;
        double sum = 0.0;
        int count =  1;

        System.out.println("Enter N");
        times = scan.nextInt();


        while (count <= times)    {
            sum = sum + (1.0 / count);
            count = count + 1;
        }

        System.out.println("Sum is: " + sum);

    }
}