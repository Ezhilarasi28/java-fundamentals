// This program checks whether a year is a leap year
package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exercise2LeapYear {
    static void main()
    {
    Scanner userInput = new Scanner(System.in);
    IO.print("User enter the year: ");
    int year = userInput.nextInt();

    if(year % 400 ==0||(year % 4 == 0 && year % 100 !=0))
    {
        IO.println(year + " is a leap year");
    }
    else
    {
        IO.println(year + " is not a leap year");
    }
}
}

