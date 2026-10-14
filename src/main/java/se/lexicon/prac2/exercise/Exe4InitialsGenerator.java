package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe4InitialsGenerator {
    void main(){
        Scanner userInput = new Scanner(System.in);
        IO.println("enter full name:");
        String fullName  = userInput.nextLine().trim();
        String[] names = fullName.split("\\s+"); // split the name into words

        StringBuilder initials =new StringBuilder();  //String initials = ""; // initial the variable
         for(int i=0;i<names.length; i++)
        {
       char firstLetter =names[i].charAt(0);//first letter of each name to get
            initials.append(Character.toUpperCase(firstLetter)).append("."); // convert the uppercase and add a dot
        }
        IO.println("initials:"+ initials);

    }
}
