/*
Exercise 1 - Profile Card

Question:
Store your name, age, and city in variables.
Then use those variables to print a formatted profile card.
Do not hardcode the values directly inside println.
They must come from variables.
*/


package se.lexicon.prac.exercise;

public class Exercise1ProfileCard  {
    static void main()
    {
        String name="Sofia";
        int age =22;
        String city = "Stockholm";
        IO.println("====================");
        IO.println("      My profile");
        IO.println("=====================");
        IO.println("Name : " +name);
        IO.println("Age : " +age);
        IO.println("City : " +city);
        IO.println("====================");

    }
}
