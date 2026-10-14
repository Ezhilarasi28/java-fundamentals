package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe5PalindromeChecker {
    void main()
    {
        Scanner userInput = new Scanner(System.in);
        IO.println("enter a word:");
        String word = userInput.nextLine();
        String lowerWord = word.toLowerCase();// convert into lowercase because java treat the r and R as different char
        StringBuilder reverseWord = new StringBuilder(lowerWord);
        reverseWord.reverse();
        if (lowerWord.contentEquals(reverseWord)) {
                IO.println(word + " palindrome");}
            else
            {
                IO.println(word + " not palindrome");
            }
        }
    }

