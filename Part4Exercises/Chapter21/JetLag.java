import java.util.Scanner;

public class JetLag {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int hours, zones, depart, arrive;

        System.out.println("Enter number of hours of travel: ");
        hours = scan.nextInt();

        System.out.println("Enter number of time zones crossed: ");
        zones = scan.nextInt();

        System.out.println("Enter departure time: ");
        depart = scan.nextInt();

        System.out.println("Enter arrival time: ");
        arrive = scan.nextInt();

        if (arrive >= 1 && arrive < 8)  {
            arrive = 3;
        } else if (arrive >= 8 && arrive < 12)  {
            arrive = 4;
        } else if (arrive >= 12 && arrive < 18)  {
            arrive = 2;
        } else if (arrive >= 18 && arrive < 22)  {
            arrive = 0;
        } else if (arrive >= 22 || arrive < 1)  {
            arrive = 1;
        }

        if (depart >= 1 && depart < 8)  {
            depart = 5;
        } else if (depart >= 8 && depart < 12)  {
            depart = 0;
        } else if (depart >= 12 && depart < 18)  {
            depart = 1;
        } else if (depart >= 18 && depart < 22)  {
            depart = 3;
        } else if (depart >= 22 || depart < 1)  {
            depart = 4;
        }

        double daysRecov = (hours / 2.0 + (zones-3) + depart + arrive)/10.0;
        System.out.println("Days of recovery would be: " + daysRecov);
    }
}