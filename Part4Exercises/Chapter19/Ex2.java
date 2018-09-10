import java.util.Scanner;

public class Ex2 {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );


        String word;
        int times;
        int count = 0;

        System.out.println("Enter a word: ");
        word = scan.nextLine();

        System.out.println("");

        times = word.length();

        while (count < times)    {
            System.out.println(word);
            count = count + 1;
        }

    }
}