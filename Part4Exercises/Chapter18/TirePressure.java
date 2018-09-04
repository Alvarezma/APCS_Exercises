import java.util.Scanner;

public class TirePressure {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int fr, fl, br, bl;

        System.out.println("Imput right front pressure: ");
        fr = scan.nextInt();

        System.out.println("Imput left front pressure: ");
        fl = scan.nextInt();

        System.out.println("Imput right back pressure: ");
        br = scan.nextInt();

        System.out.println("Imput left back pressure: ");
        bl = scan.nextInt();

        if (fr == fl && bl == br) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is NOT OK");
        }
    }
}