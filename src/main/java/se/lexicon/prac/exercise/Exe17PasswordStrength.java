package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe17PasswordStrength {
    static void main(){
        Scanner input = new Scanner(System.in);
        IO.println("enter password: ");
        String password = input.nextLine();

        int rules =0;
        boolean upperCase = false;
        boolean number = false;


        if(password.length()>=8)
        {
            rules++;
        }
        for(int i=0; i<password.length(); i++)
        {
            char ch = password.charAt(i);
            if(ch>='A' && ch<='Z'){
                upperCase = true;
            }
            if(ch>='0' && ch<='9'){
                number = true;
            }
        }
        if(upperCase){
            rules++;
        }
        if(number){
            rules++;
        }
        IO.println("Rules met:" + rules + "/3");
        if(rules ==3)
        {
            IO.println("Password strength: STRONG");
        }
            if(rules ==2)
            {
                IO.println("Password strength: MEDIUM");
            }
            else
            {
                IO.println("Password strength check:WEAK");
            }
        }
    }
