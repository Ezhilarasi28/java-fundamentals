package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe2EmailSlicer {
    void main(){
        Scanner userInput = new Scanner(System.in);
        IO.println("Enter Email:");
        String email = userInput.nextLine();
        int atPosition = email.indexOf("@");//find he position of @
        String username =email.substring(0, atPosition);//get username before @
        String domain = email.substring(atPosition+1);//get domain @
        IO.println("username:"+username );
        IO.println("domain:"+domain);
    }
}
