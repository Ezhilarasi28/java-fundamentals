package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe1WordReverser {
    void main(){
       // StringBuilder wordReverse =new StringBuilder("Stockholm");
        Scanner word1Reverse = new Scanner(System.in);
        IO.println("Enter a word:");
        String word= word1Reverse.nextLine();
        StringBuilder wordReverse = new StringBuilder(word);
        wordReverse.reverse();
        IO.println("wordReverse:"+wordReverse);
    }

}
