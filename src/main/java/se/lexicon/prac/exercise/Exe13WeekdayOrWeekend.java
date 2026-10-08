package se.lexicon.prac.exercise;
import java.util.Scanner;

public class Exe13WeekdayOrWeekend {

    static void main() {

        Scanner userInput = new Scanner(System.in);
        IO.print("Enter a day of the week: ");
        String day = userInput.nextLine();
        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday"
                    -> IO.println("Weekday");
            case "saturday", "sunday"
                    -> IO.println("Weekend");
            default
                    -> IO.println("Unknown day");

        }
    }
}


