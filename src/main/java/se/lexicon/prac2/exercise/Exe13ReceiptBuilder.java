package se.lexicon.prac2.exercise;

import java.util.Scanner;

public class Exe13ReceiptBuilder {

    void main() {

        Scanner userInput = new Scanner(System.in);
        StringBuilder receipt = new StringBuilder();
        double grandTotal = 0;
        while (true) {
            IO.print("Enter item name (or 'done'): ");
            String itemName = userInput.nextLine();
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            IO.print("Enter price: ");
            double price = userInput.nextDouble();
            userInput.nextLine();
            receipt.append(
                    String.format("%-22s %7.2f%n", itemName, price)
            );
            grandTotal += price;
        }

        IO.println();
        IO.println("==============================");
        IO.println("           Receipt");
        IO.println("==============================");

        IO.print(receipt.toString());

        IO.println("------------------------------");
        IO.println(String.format("Grand Total: %17.2f", grandTotal));
        IO.println("==============================");

    }
}