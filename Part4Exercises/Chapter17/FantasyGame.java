import java.util.Scanner;

public class FantasyGame {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        String name;
        int str, hea, luck;

        System.out.println("Enter the name of your character: ");
        name = scan.nextLine();

        System.out.println("Enter strength (1-10): ");
        str = scan.nextInt();

        System.out.println("Enter health (1-10): ");
        hea = scan.nextInt();

        System.out.println("Enter luck (1-10): ");
        luck = scan.nextInt();

        if (str + hea + luck >= 15) {
            str = 5;
            hea = 5;
            luck = 5;
            System.out.println("You gave your character too many points! Defaults have been assigned:");
        }
        
        System.out.println(name + ", strength: " + str + ", health: " + hea + ", luck: " + luck);

    }
}