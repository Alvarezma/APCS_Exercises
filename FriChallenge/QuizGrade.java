import java.util.Scanner;

public class QuizGrade {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        String input = "a";
        int grade = 0;
        int low = 0;
        int high = 0;
        int sum = 0;
        int numOfQuiz = 0;
        double average;
        String letterGrade = "";

        System.out.println("Enter Grade (0 - 100): ");
        input = scan.nextLine();
        
        if (!(input.equals(""))) {
            grade = Integer.parseInt(input);
            
            low = grade;
            high = grade;
            numOfQuiz = 1;
            sum = grade;
        }

        while (!(input.equals("")))    {
            System.out.println("Enter Grade (0 - 100): ");
            input = scan.nextLine();
            if (!(input.equals(""))) {
                grade = Integer.parseInt(input);
                if (grade > high)   {
                    high = grade;
                } else if (grade < low) {
                    low = grade;
                }
                numOfQuiz = numOfQuiz + 1;
                sum = sum + grade;
            }
        }

        numOfQuiz = numOfQuiz - 2;
        sum = sum - high - low;
        
        average = (sum * 1.0) / numOfQuiz;

        if (average < 60)   {
            letterGrade = "F";
        } else if (average >= 60 && average < 70)   {
            letterGrade = "D";
        } else if (average >= 70 && average < 80)   {
            letterGrade = "C";
        } else if (average >= 80 && average < 90)   {
            letterGrade = "B";
        } else if (average >= 90 && average < 100)   {
            letterGrade = "A";
        }

        System.out.println("Average quiz grade: " + average);
        System.out.println("Letter grade is: " + letterGrade);

    }
}