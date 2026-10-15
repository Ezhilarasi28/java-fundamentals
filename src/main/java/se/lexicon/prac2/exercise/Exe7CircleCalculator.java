package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe7CircleCalculator {
    void main(){
    Scanner userInput = new Scanner(System.in);
    IO.print("Enter radius:");
    double radius = userInput.nextDouble();
    double area = Math.PI * radius * radius;
    double circumference = 2 * Math.PI * radius;
    IO.println(String.format("Area         :%.2f",area));
    IO.println(String.format("Circumference:%2f", circumference));
}
}
