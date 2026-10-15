package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe9RightTriangleChecker {

    void main() {

        // Step 1 - Create Scanner object
        Scanner userInput = new Scanner(System.in);

        // Step 2 - Read three sides
        IO.println("Enter side a:");
        double a = userInput.nextDouble();

        IO.println("Enter side b:");
        double b = userInput.nextDouble();

        IO.println("Enter side c:");
        double c = userInput.nextDouble();

        // Step 3 - Find the longest side
        double longestSide = Math.max(a, Math.max(b, c));

        IO.println("Longest side: " + longestSide);

        // Step 4 - Check if the sides form a triangle
        if (a <= 0 || b <= 0 || c <= 0 ||
                a + b <= c || a + c <= b || b + c <= a) {

            IO.println("Invalid triangle.");

        } else {

            // Step 5 - Calculate squares of all sides
            double sumOfSquares =
                    Math.pow(a, 2) + Math.pow(b, 2)
                            + Math.pow(c, 2);

            // Step 6 - Check Pythagorean theorem
            double longestSquare = Math.pow(longestSide, 2);

            if (Math.abs(sumOfSquares - 2 * longestSquare) < 0.000001) {
                IO.println("This IS a right triangle.");
            } else {
                IO.println("This is NOT a right triangle.");
            }
        }
    }
}
