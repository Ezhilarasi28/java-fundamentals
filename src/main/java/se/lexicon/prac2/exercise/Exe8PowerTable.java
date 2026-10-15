package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe8PowerTable {
    void main(){
        Scanner userInput = new Scanner(System.in);
        IO.print("Enter base input:");
        int base = userInput.nextInt();
        for(int power =1; power<=10; power++){
            double result = Math.pow(base,power);
            IO.println(String.format(  "%d ^ %-2d = %10.1f",
                    base, power, result));
        }
    }
}
