/*Workshop – Café Order System

## The Scenario

You are building a console application for **Lexicon Café**.
The cashier uses the app to greet customers, take orders, apply discounts, and print receipts.
There is no database, no web interface — just a clean, working console program.

**Create `CafeApp.java`** inside `src/main/java/se/lexicon/`.
Commit regularly as you make progress.

---

## Requirements

Your application must:

- Display the café menu with item numbers, names, and prices
- Greet the customer by name
- Let the customer pick an item by number and choose a quantity
- Ask whether the customer is a loyalty member
- Calculate the bill according to these rules:
  - Base price: `unit price × quantity`
  - Discount rules (only one applies, member discount takes priority):
    - Loyalty member: **15% off** the base price
    - No membership but order exceeds **150 SEK**: **10% off**
  - VAT of **12%** is applied **after** the discount
- Print a formatted receipt showing every line: subtotal, discount (if any), VAT, and total
- Organise the logic into **methods** — `main` should only coordinate, not calculate

---
*/
// TC01: Loyalty member, 2 lattes – 15% discount.
// TC02: Non-member, 6 sandwiches – 10% discount.
// TC03: Non-member, 1 espresso – No discount.
// TC04: Non-member, order exactly 150 SEK – No discount.*/


package se.lexicon.lexicon.cafe;

/*import java.util.Scanner;

public class CafeApp {
    static void main() {


        Scanner username = new Scanner(System.in);
        IO.println(" **** Welcome to lexiCafe ****");

        IO.println(" " + "--- What is your name?--- " + " ");
        String name = username.nextLine();
        IO.println(" Hi " + " " + name + " !!!!! ");
        IO.println();

        //item names and prices
        String item1Name = "Espresso";
        double price1 = 45.00;

        String item2Name = "Cappuccino";
        double price2 = 55.00;

        String item3Name = "Latte";
        double price3 = 40.00;

        String item4Name = "Croissant";
        double price4 = 35.00;

        String item5Name = "Sandwich";
        double price5 = 60.00;

        //call menu method
        displayMenu();

        IO.println("Which item menu do you want to choose (1-5):");
        int itemNum = username.nextInt();

        double eachItemPrice = 0;
        String itemName = " ";

        switch (itemNum) {
            case 1:
                eachItemPrice = price1;
                itemName = item1Name;
                break;
            case 2:
                eachItemPrice = price2;
                itemName = item2Name;
                break;
            case 3:
                eachItemPrice = price3;
                itemName = item3Name;
                break;
            case 4:
                eachItemPrice = price4;
                itemName = item4Name;
                break;
            case 5:
                eachItemPrice = price5;
                itemName = item5Name;
                break;
            default:
                IO.println("Invalid input");
                return;
        }
        IO.println("How many would you like:");
        int quantity = username.nextInt();

        if (quantity <= 0 ) {
            IO.println("Invalid quantity");
            username.close();
            return;
        }
        IO.println("Do you have the loyalty membership card (yes/no): ");
        String card = username.next();


        //call calculation methods
        double subtotalAllPrice = calculateSubtotal(eachItemPrice, quantity);
        double discount = calculateDiscount(subtotalAllPrice, card);
        double priceAfterDiscount =calculatePriceAfterDicount(subtotalAllPrice, discount);
        double vat = calculateVat(priceAfterDiscount);
        double finalPrice = calculateTotal(priceAfterDiscount, vat);

        //call receipt method
        printReceipt(name, itemName, quantity, subtotalAllPrice, discount, vat, finalPrice);
        username.close();
    }

    //method1 :display menu
    static void displayMenu() {
        IO.println(" Here is the menu ");
        IO.println("-----------------------------");
        IO.println("        LexiCafe         ");
        IO.println("-----------------------------");
        IO.println(String.format("%d. %-15s %6.2f SEK", "Espresso", 45));
        IO.println(String.format("%d. %-15s %6.2f SEK", "Cappuccino", 55));
        IO.println(String.format("%d. %-15s %6.2f SEK", "Latte", 40.00));
        IO.println(String.format("%d. %-15s %6.2f SEK", "Croissant", 35.00));
        IO.println(String.format("%d. %-15s %6.2f SEK", "Sandwich", 60.00));
        IO.println("-----------------------------");

//method2:Calculate subtotal
        static double calculateSubtotal(double eachItemPrice,int quantity)
        {
            return eachItemPrice * quantity;
        }

//methood3: calculate discount
        static double calculateDiscount(double subtotalAllPrice, String card)
        {
            if (card.equalsIgonreCase("yes")) {
                return subtotalAllPrice * 0.15;

            } else if (subtotalAllPrice > 150) {
                return subtotalAllPrice * 0.10;
                {
                        else{
                    return 0;
                }
                }
                //price after discount method:4
                static double calculatePriceAfterDiscount(double subtotalAllPrice,
                double discount){
                    return subtotalAllPrice - discount;

                }
                //method:5 Calculate VAT
                static double calculateVat ( double priceAfterDiscount)
                {
                    return priceAfterDiscount * 0.12;

                }
                // METHOD 6: Calculate final total
                static double calculateTotal ( double priceAfterDiscount, double vat){

                    return priceAfterDiscount + vat;
                }

                // METHOD 7: Print receipt
                static void printReceipt
                (String name, String itemName,
                int quantity, double subtotalAllPrice,
                double discount, double vat,
                double finalPrice){

                    IO.println("--------------------------------");
                    IO.println("         LexiCafe Receipt");
                    IO.println("--------------------------------");

                    IO.println("Customer : " + name);
                    IO.println("Item     : " + itemName + " x " + quantity);

                    IO.println(String.format("Subtotal : %.2f SEK", subtotalAllPrice));

                    if (discount > 0) {
                        IO.println(String.format("Discount : -%.2f SEK", discount));
                    }

                    IO.println(String.format("VAT (12%%): %.2f SEK", vat));
                    IO.println("--------------------------------");
                    IO.println(String.format("TOTAL    : %.2f SEK", finalPrice));
                    IO.println("--------------------------------");
                }
            }

        }
    }
}




*/

