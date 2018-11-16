import java.util.Scanner;

class PanagramDetect    {

    public static void main( String[] args )    {
        Scanner scan = new Scanner( System.in );

        System.out.println("Write a sentence:");
        String sentence = scan.nextLine().toLowerCase();

        int[] letters = new int[26];
        boolean panagram = true;

        for (int i = 0; i < sentence.length(); i++)   {
            int chr = (int)sentence.charAt(i);
            if (chr >= 97 && chr <= 122)    {
                letters[chr - 97] += 1;
            }
        }

        for ( int count : letters ) {
            if (count < 1)  {
                panagram = false;
            }
        }
        
        if (panagram)   {
            System.out.println("The sentence is a panagram");
        } else  {
            System.out.println("The sentence is NOT a panagram");
        }
    }
}