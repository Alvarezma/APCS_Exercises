import java.util.Scanner;

public class WedgeStars {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int initNum;
        int count = 0;

        System.out.println("Initial number of stars: ");
        initNum = scan.nextInt();

        while (initNum > 0) {
            System.out.println("");
            count = 0;
            while (count < initNum)   {
                System.out.print("*");
                count = count + 1;
            }
            initNum = initNum - 1;
        }
    }
}