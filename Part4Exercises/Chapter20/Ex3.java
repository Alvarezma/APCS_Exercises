import java.util.Scanner;

public class Ex3 {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int n;
        double sum = 0.0;
        double sumSquared = 0.0;
        double num;
        int count =  0;

        System.out.println("Enter N");
        n = scan.nextInt();


        while (count < n)    {
            System.out.println("Enter number");
            num = scan.nextDouble();

            sum = sum + num;
            sumSquared = sumSquared + (num * num);

            count = count + 1;
        }

        double sd = Math.sqrt((sumSquared/n) - ((sum / 4) * (sum / 4)));
        System.out.println("Standard deviation: " + sd);

    }
}