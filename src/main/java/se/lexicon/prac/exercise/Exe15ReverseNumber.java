package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe15ReverseNumber {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        IO.println("Enter a number: ");
        int number = userInput.nextInt();
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
            IO.println("Reversed:" + reversedNumber);
            userInput.close();
        }
    }
}

