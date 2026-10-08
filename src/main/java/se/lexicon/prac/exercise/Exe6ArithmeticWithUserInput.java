package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe6ArithmeticWithUserInput {
    static void main() {
        Scanner input = new Scanner(System.in);
        IO.println(" Enter the first num:");
        int num1 = input.nextInt();
        IO.println("enter the second num:");
        int num2 = input.nextInt();

        int a = num1 + num2;
        int b = num1 - num2;
        int c = num1 * num2;
        double d = (double) num1 / num2;
        int e = num1 % num2;

        IO.println("enter the output:" );
        IO.println("addition:"  + a + "  \n "+"subtraction:"+ b + "\n " +"multiplication:" +c + "\n " +"division:"  +d + "\n " + "module:" +e);
        input.close();
    }
}
