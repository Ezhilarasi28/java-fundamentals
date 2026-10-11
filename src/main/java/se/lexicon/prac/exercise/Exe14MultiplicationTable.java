package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe14MultiplicationTable {
    static void main(){
        Scanner userInput = new Scanner(System.in);
        IO.println("user enter the number:");
        int number = userInput.nextInt();
        for(int i = 1;i <=10; i++){
            int result = number*i;
            IO.println(number + "X"+ i +"="+result);


        }
        userInput.close();
    }
}
