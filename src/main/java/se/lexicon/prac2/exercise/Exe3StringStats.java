package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe3StringStats {
    void main()
    {
        Scanner userInput = new Scanner(System.in);
        IO.println("enter a sentence:");
        String sentence = userInput.nextLine().toLowerCase(); //read sentence and convert to lowercase
        int vowels =0; //starting from zero
        int consonants =0;
        int digits =0;
        int spaces =0;
        for (int i=0; i<sentence.length(); i++)//check every character in the sentence
        {
            char letter =sentence.charAt(i);
            //check vowels
            if(letter =='a'|| letter =='e'|| letter =='i'|| letter =='o'|| letter =='u'){
                vowels++;
            }
            //check constants
            else if( letter >= 'a' && letter <= 'z')
            {
                consonants++;
            }
            //check digits
            else if(letter >= '0' && letter <= '9')
            {
                digits++;
            }
            //check spaces
            else if(letter == ' ')
            {
                spaces++;
            }
        }
        IO.println("vowels:" +vowels);
        IO.println("consonants:" +consonants);
        IO.println("digits:" +digits);
        IO.println("spaces:" +spaces);
    }
}
