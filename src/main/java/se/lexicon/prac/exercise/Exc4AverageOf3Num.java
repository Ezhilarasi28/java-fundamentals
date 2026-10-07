
//Question
//Ask the user to enter three integers. Calculate and print their average. Make sure the result shows the decimal part.

package se.lexicon.prac.exercise;
import java.util.Scanner;

public class Exc4AverageOf3Num {
static void main(){
Scanner userInput =new Scanner(System.in);

    IO.println( "Enter the first number:");
    int num1 = userInput.nextInt();

    IO.println("Enter the second number:");
    int num2 = userInput.nextInt();

    IO.println("Enter the third number:");
    int num3 = userInput.nextInt();
    int total = num1 + num2 + num3 ;
    double average = total/3.0;
    IO.println("Average = " + average);
}

}
