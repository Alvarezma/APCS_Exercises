import java.util.Scanner;

public class MicroTime {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int time, items;
        int min, sec;

        System.out.println("How many items to heat: ");
        items = scan.nextInt();

        System.out.println("Enter Time for one item: ");
        time = scan.nextInt();

        if (time < 100) {
            sec = time;
        } else {
            min = time / 100;
            sec = min * 60;
            sec = sec + (time % 100);
        }

        if (items == 2) {
            sec = sec + (sec / 2);
        } else if (items == 3) {
            sec = sec * 2;
        } else if (items > 3) {
            System.out.println("More than 3 items not recommended");
        }

        min = sec / 60;
        sec = sec % 60;

        System.out.println("Heat for " + min + " minutes " + sec + " seconds");
    }
}