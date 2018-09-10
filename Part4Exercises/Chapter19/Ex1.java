import java.util.Scanner;

public class Ex1 {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int start, end;

        System.out.println("Enter Start: ");
        start = scan.nextInt();

        System.out.println("Enter End: ");
        end = scan.nextInt();

        while (start <= end)    {
            System.out.println(start);
            start = start + 1;
        }

    }
}