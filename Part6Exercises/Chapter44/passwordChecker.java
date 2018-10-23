import java.util.Scanner;

public class passwordChecker   {

    public static void main( String[] args) {
        Scanner scan = new Scanner( System.in );

        boolean acceptable = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;

        System.out.println("Enter your password:");
        String password = scan.nextLine();

        while (!acceptable)  {
            if (password.length() >= 7)  {
                for(int i = 0; i < password.length(); i++)  {
                    String ch = password.substring(i, i + 1);
                    if (ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("5") || ch.equals("6") || ch.equals("7") || ch.equals("8") || ch.equals("9") || ch.equals("0"))  {
                        digit = true;
                    } else  {
                        if (ch.toUpperCase().equals(ch))   {
                            upperCase = true;
                        }
                        if (ch.toLowerCase().equals(ch))   {
                            lowerCase = true;
                        }
                    }
                }
                if (upperCase && lowerCase && digit)    {
                    acceptable = true;
                }
            }
            if (acceptable)  {
                System.out.println("Acceptable password");
            } else  {
                System.out.println("That password is not acceptable");
                System.out.println("");

                System.out.println("Enter your password:");
                password = scan.nextLine();

                upperCase = false;
                lowerCase = false;
                digit = false;
            }
        }
    }
}