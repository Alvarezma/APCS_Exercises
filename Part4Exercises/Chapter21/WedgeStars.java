import java.util.Scanner;

public class WedgeStars {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int initNum;
        int count = 0;

        System.out.println("Initial number of stars: ");
        initNum = scan.nextInt();

        while (count < initNum)   {
            System.out.println();
            count = count + 1;
        }
    }
}