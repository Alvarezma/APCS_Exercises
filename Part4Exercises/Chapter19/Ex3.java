import java.util.Scanner;

public class Ex3 {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );


        String word1, word2;
        int times;
        int count = 0;

        System.out.println("Enter first word: ");
        word1 = scan.nextLine();

        System.out.println("Enter second word: ");
        word2 = scan.nextLine();

        System.out.println("");

        times = 30 - (word1.length() + word2.length());


        System.out.print(word1);
        while (count < times)    {
            System.out.print(".");
            count = count + 1;
        }
        System.out.print(word2);

    }
}