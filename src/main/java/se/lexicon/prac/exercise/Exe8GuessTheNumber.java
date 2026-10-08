/**/

package se.lexicon.prac.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exe8GuessTheNumber {
    static void main()
    {
        Scanner userInput= new Scanner(System.in);
        Random randomNumber= new Random();
        int numbers = randomNumber.nextInt(500) + 1;
        IO.println("Secret number is: " + numbers);
        int answers ;
        int tries=0;
        IO.println("guess a number between 1 and 500");
        while (true)
        {
          IO.print("Enter the my guess:");
          answers = userInput.nextInt();
          tries++ ;


          if(answers < numbers)
          {
             IO.println("Too Small");
          }
          else if(answers > numbers)
              {
              IO.println("Too Big");
              }
          else
              {
              IO.println(" Congratulations! You got it in " + tries + " guesses.");
              break;
              }
        }


    }

}
