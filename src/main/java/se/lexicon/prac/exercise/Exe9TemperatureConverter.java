/*## Exercise 9 – Temperature Converter

### Question
Ask the user to enter a temperature in Celsius. Convert it to both Fahrenheit and Kelvin and print all three values.

Formulas:
- `°F = °C × 9.0 / 5 + 32`
- `K  = °C + 273.15`*/

package se.lexicon.prac.exercise;

import java.util.Scanner;

public class Exe9TemperatureConverter {
    static void main() {

      Scanner input = new Scanner(System.in);

        IO.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9.0 / 5 + 32;
        double kelvin = celsius + 273.15;

        IO.println("Celsius: " + celsius + " °C");
        IO.println("Fahrenheit: " + fahrenheit + " °F");
        IO.println("Kelvin: " + kelvin + " K");


    }

}
