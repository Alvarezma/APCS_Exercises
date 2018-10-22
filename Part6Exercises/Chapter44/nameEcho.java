import java.util.Scanner;

public class nameEcho   {

    public static void main( String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter your name:");
        String fullName = scan.nextLine();
        fullName = fullName.trim();
        System.out.println(fullName);
        String lastName = fullName.substring(fullName.indexOf(" "), fullName.length());
        System.out.println(lastName);
    }
}