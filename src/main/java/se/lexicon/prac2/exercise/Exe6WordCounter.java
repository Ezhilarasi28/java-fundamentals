/*## Exercise 6 – Word Counter

### Question
Ask the user to enter a sentence. Count how many words it contains and how many times a specific word appears in it. The search should be case-insensitive.

**Example interaction:**
```text
Enter a sentence  : To be or not to be that is the question
Enter word to find: be
Total words : 10
"be" appears: 2 times*/


package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe6WordCounter {
    void main(){
        Scanner userInput = new Scanner(System.in);
        IO.println("Enter a sentence:");
        String sentence = userInput.nextLine();
        IO.println("Enter word to find:");
        String word = userInput.nextLine();
        String[] words = word.trim(). isEmpty()
        ? new String[0]: sentence.trim(). split(" \\s+");
        int count =0;
        for(String currentWord :words){
            if(currentWord.equalsIgnoreCase(word)){
                count++;
            }
        }
        IO.println("Total words found: "+ words.length);
        IO.println("\" "+ word+ "\" appers: "+count +"times");
    }

}
