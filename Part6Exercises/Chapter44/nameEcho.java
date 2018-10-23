import java.util.Scanner;

public class nameEcho   {

    public static void main( String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter your name:");
        String fullName = scan.nextLine();

        fullName = fullName.trim();

        if (fullName.indexOf(" ") > 0)  {
            String firstName = fullName.substring(0,fullName.indexOf(" "));
            String lastName = fullName.substring(fullName.indexOf(" "));

            lastName = lastName.toUpperCase();

            System.out.println(firstName + lastName);
        } else {
            System.out.println(fullName);
        }

    }
}