//Question
//Ask the user to enter their first name and last name separately. Then print a personalised greeting that includes the full name.

package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe5GreetTheUser {
    static void main(){
        Scanner username = new Scanner(System.in);

        IO.println("Enter user name:");
        String firstname = username.nextLine();
        IO.println("Enter user lastname:");
        String lastname = username.nextLine();
        IO.println("Hello "  + firstname + " "  + lastname + " !welcome board &&&");

    }

}
