import java.util.Scanner;

public class MissileLaunch {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        System.out.println("In how many minutes does your missile launch: ");
        int min = scan.nextInt();
        int sec = min * 60;

        while ( sec > 0 )  {
            if (sec % 60 == 0)  {
                System.out.println("T-minus " + (sec / 60) + " minutes to launch");    
            } else if (sec / 60 == 0) {
                System.out.println("T-minus " + (sec % 60) + " seconds to launch");    
            } else {
                System.out.println("T-minus " + (sec / 60) + " minute " + (sec % 60) + " seconds to launch");
            }
            sec = sec - 10;
        }

        System.out.print("Missile Away!");

    }
}