/*Exercise 11 – FizzBuzz

### Question
Print every integer from **1 to 30**, one per line, applying these rules:

- Divisible by **3** → print `Fizz`
- Divisible by **5** → print `Buzz`
- Divisible by **both 3 and 5** → print `FizzBuzz`
- Otherwise → print the number*/

package se.lexicon.prac.exercise;

public class Exe11FizzBuzz {
    static void main() {

        for (int i = 1; i <= 15; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                IO.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                IO.println("Fizz");
            }
            else if (i % 5 == 0) {
                IO.println("Buzz");
            }
            else {
                IO.println(i);
            }
        }
    }
}




