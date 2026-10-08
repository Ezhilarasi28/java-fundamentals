/*Question
Print every integer from **1 to 30**, one per line, applying these rules:

- Divisible by **3** → print `Fizz`
- Divisible by **5** → print `Buzz`
- Divisible by **both 3 and 5** → print `FizzBuzz`
- Otherwise → print the number*/

package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe10SwapTwoValues {

    static void main() {
     Scanner userInput = new Scanner(System.in);
 IO.print("Enter the first number:");
        int a = userInput.nextInt();
 IO.print("Enter the second number:");
        int b = userInput.nextInt();

        IO.println("Before: a = " + a + ", b = " + b);

        // Swap without a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        IO.println("After: a = " + a + ", b = " + b);
    }
}



