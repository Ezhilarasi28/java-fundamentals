/* Question
Ask the user to enter a score between 0 and 100. Print the matching letter grade. If the score is outside that range, print an error message.

| Score     | Grade |
|:----------|:------|
| 90 to 100 | A     |
| 80 to 89  | B     |
| 70 to 79  | C     |
| 60 to 69  | D     |
| 0 to 59   | F     |
*/


package se.lexicon.prac.exercise;
import java.util.Scanner;

public class Exe12StudentGrade {
    static void main() {

        Scanner userInput = new Scanner(System.in);

        IO.print("Enter your score (0-100): ");
        int score = userInput.nextInt();

        if (score < 0 || score > 100)
        {
            IO.println("Error: Invalid score");
        }
        else if (score >= 90)
        {
            IO.println("Grade: A");
        }
        else if (score >= 80)
        {
            IO.println("Grade: B");
        }
        else if (score >= 70)
        {
            IO.println("Grade: C");
        }
        else if (score >= 60)
        {
            IO.println("Grade: D");
        }
        else
        {
            IO.println("Grade: F");
        }


    }
}



