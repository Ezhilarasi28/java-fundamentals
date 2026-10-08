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
    static void main()
    {


        Scanner username = new Scanner(System.in);
        IO.println(" **** Welcome to lexiCafe ****");

        IO.println(" " + "--- What is your name?--- " + " ");
        String name = username.nextLine();
        IO.println(" Hi " + " " + name + " !!!!! ");
        IO.println();

        String item1Name = "Espresso";
        double price1 = 25.00;

        String item2Name = "Cappuccino";
        double price2 = 35.00;

        String item3Name = "Latte";
        double price3 = 40.00;

        String item4Name = "Croissant";
        double price4 = 30.00;

        String item5Name = "Sandwich";
        double price5 = 55.00;


        IO.println(" Here is the menu ");
        IO.println("-----------------------------");
        IO.println("        LexiCafe         ");
        IO.println("-----------------------------");

        /*
         * String.format() - Formats and aligns text and numbers.
         * %-15s = Left align String (width 15)
         * %15s  = Right align String (width 15)
         * %d    = Integer (whole number)
         * %6.2f = Right align decimal (width 6, 2 decimals)
         */

       /* IO.println(itemNum1 + "." + item1Name + "=" + price1 +"sek"); */// IO.println(String.format("%d. %-15s %6.2f SEK", itemNum1, item1Name, price1));//
      /*  IO.println(itemNum2 + "." + item2Name + "=" + price2+"sek");  */ //IO.println(String.format("%d. %-15s %6.2f SEK", itemNum2, item2Name, price2));
       /* IO.println(itemNum3 + "." + item3Name + "=" + price3 +"sek"); */ //IO.println(String.format("%d. %-15s %6.2f SEK", itemNum3, item3Name, price3));
       /* IO.println(itemNum4 + ". " +item4Name +"=" + price4 +"sek");*/ // IO.println(String.format("%d. %-15s %6.2f SEK", itemNum4, item4Name, price4));
      /*  IO.println(itemNum5 + "." + item5Name + "=" + price5 +"sek"); */// IO.println(String.format("%d. %-15s %6.2f SEK", itemNum5, item5Name, price5));

     /*   IO.println("-----------------------------");

        IO.println("Which item menu do you want to choose (1-5):");
        int itemNum = username.nextInt();

        IO.println("How many would you like:");
        int quantity = username.nextInt();

        IO. println("Do you have the loyalty membership card (yes/no): ");
        String card = username.next();
        double eachItemPrice = 0;
        String itemName = " ";

        switch(itemNum) {
            case 1:
                eachItemPrice = price1;
                itemName =item1Name;
                break;
                case 2:
                    eachItemPrice = price2;
                    itemName =item2Name;
                    break;
                    case 3:
                        eachItemPrice = price3;
                        itemName =item3Name;
                            break;
                            case 4:
                                eachItemPrice = price4;
                                itemName =item4Name;
                                break;
                                case 5:
                                    eachItemPrice = price5;
                                    itemName =item5Name;
                                    break;
                                    default:
                                        IO.println("Invalid input");
                                        return;
        }
        IO.println("Customer  : " + name);
        IO.println("Item      : " + itemName + " x " + quantity);

        if (discount > 0) {
            IO.println(String.format("Discount  : -%.2f SEK", discount));
            IO.println(String.format("Subtotal  : %.2f SEK", subtotalAllPrice));
            IO.println(String.format("VAT       : %.2f SEK", vat));
            IO.println(String.format("TOTAL     : %.2f SEK", finalPrice));


            double subtotalAllPrice = eachItemPrice * quantity; //overall total calculation
        double discount = 0; //next discount calculation


        if(card.equalsIgnoreCase("yes")) // string method compare the text
        {
            discount =subtotalAllPrice * 0.15;
           // IO.println("Person is applicable for 15% :" );
        }
        else if(subtotalAllPrice >150)
        {
            discount =subtotalAllPrice * 0.10;
        }
        else
    {
        discount = 0;

    }
        double priceAfterDiscount = subtotalAllPrice - discount;
        double vat = priceAfterDiscount * 0.12;
        double finalPrice = priceAfterDiscount + vat;

        static double calculateSubtotal(double eachItemPrice, int quantity)
            {
            return eachItemPrice * quantity;
            }

            IO.println("---------------------------------------");
        IO.println("              LexiCafe                 ");
        IO.println("-------------------------------------  ");
        IO.println("Subtotal: " + subtotalAllPrice + " SEK");
        IO.println("Discount: " + discount + " SEK");
        IO.println("Price after discount: " + priceAfterDiscount + " SEK");
        IO.println("VAT (12%): " + vat + " SEK");
        IO.println("------------------------------------------");
        IO.println("Final total: " + finalPrice + " SEK");
        IO.println("------------------------------------------");


    }
}
*/

import java.util.Scanner;

public class CafeApp {

    static void main() {

        Scanner username = new Scanner(System.in);

        // Step 1: Greet customer
        IO.print("Welcome! What is your name? ");
        String name = username.nextLine();

        IO.println("Hi " + name + "! Here is our menu:");
        IO.println();

        // Step 2: Display menu
        displayMenu();

        // Step 3: Get customer order
        IO.print("Enter item number (1-5): ");
        int itemNum = username.nextInt();

        if (itemNum < 1 || itemNum > 5) {
            IO.println("Invalid item number");
            return;
        }

        IO.print("How many? ");
        int quantity = username.nextInt();

        if (quantity <= 0) {
            IO.println("Invalid quantity");
            return;
        }

        IO.print("Loyalty member? (yes/no): ");
        String card = username.next();

        // Step 4: Get item name and price
        double eachItemPrice = getItemPrice(itemNum);
        String itemName = getItemName(itemNum);

        // Step 5: Calculate bill using methods
        double subtotalAllPrice =
                calculateSubtotal(eachItemPrice, quantity);

        double discount =
                calculateDiscount(subtotalAllPrice, card);

        double priceAfterDiscount =
                calculatePriceAfterDiscount(subtotalAllPrice, discount);

        double vat = calculateVat(priceAfterDiscount);

        double finalPrice =
                calculateFinalPrice(priceAfterDiscount, vat);

        // Step 6: Print receipt
        printReceipt(name, itemName, quantity,
                subtotalAllPrice, discount, vat, finalPrice);

        username.close();
    }

    // Method 1: Display cafe menu
    static void displayMenu() {

        String item1Name = "Espresso";
        int itemNum1 = 1;
        double price1 = 25.00;

        String item2Name = "Cappuccino";
        int itemNum2 = 2;
        double price2 = 35.00;

        String item3Name = "Latte";
        int itemNum3 = 3;
        double price3 = 40.00;

        String item4Name = "Croissant";
        int itemNum4 = 4;
        double price4 = 30.00;

        String item5Name = "Sandwich";
        int itemNum5 = 5;
        double price5 = 55.00;

        IO.println("==============================");
        IO.println("       Lexicon Cafe");
        IO.println("==============================");

        IO.println(String.format("%d. %-15s %5.2f SEK",
                itemNum1, item1Name, price1));

        IO.println(String.format("%d. %-15s %5.2f SEK",
                itemNum2, item2Name, price2));

        IO.println(String.format("%d. %-15s %5.2f SEK",
                itemNum3, item3Name, price3));

        IO.println(String.format("%d. %-15s %5.2f SEK",
                itemNum4, item4Name, price4));

        IO.println(String.format("%d. %-15s %5.2f SEK",
                itemNum5, item5Name, price5));

        IO.println("==============================");
        IO.println();
    }

    // Method 2: Get selected item price
    static double getItemPrice(int itemNum) {

        double eachItemPrice = 0;

        switch (itemNum) {
            case 1:
                eachItemPrice = 25.00;
                break;
            case 2:
                eachItemPrice = 35.00;
                break;
            case 3:
                eachItemPrice = 40.00;
                break;
            case 4:
                eachItemPrice = 30.00;
                break;
            case 5:
                eachItemPrice = 55.00;
                break;
            default:
                return 0;
        }

        return eachItemPrice;
    }

    // Method 3: Get selected item name
    static String getItemName(int itemNum) {

        String itemName = "";

        switch (itemNum) {
            case 1:
                itemName = "Espresso";
                break;
            case 2:
                itemName = "Cappuccino";
                break;
            case 3:
                itemName = "Latte";
                break;
            case 4:
                itemName = "Croissant";
                break;
            case 5:
                itemName = "Sandwich";
                break;
            default:
                itemName = "Invalid item";
        }

        return itemName;
    }

    // Method 4: Calculate subtotal
    static double calculateSubtotal(double eachItemPrice, int quantity) {
        return eachItemPrice * quantity;
    }

    // Method 5: Calculate discount
    static double calculateDiscount(double subtotalAllPrice, String card) {

        double discount = 0;

        if (card.equalsIgnoreCase("yes")) {
            discount = subtotalAllPrice * 0.15;
        }
        else if (subtotalAllPrice > 150) {
            discount = subtotalAllPrice * 0.10;
        }
        else {
            discount = 0;
        }

        return discount;
    }

    // Method 6: Calculate price after discount
    static double calculatePriceAfterDiscount(
            double subtotalAllPrice, double discount) {

        return subtotalAllPrice - discount;
    }

    // Method 7: Calculate VAT
    static double calculateVat(double priceAfterDiscount) {
        return priceAfterDiscount * 0.12;
    }

    // Method 8: Calculate final price
    static double calculateFinalPrice(double priceAfterDiscount, double vat) {
        return priceAfterDiscount + vat;
    }

    // Method 9: Print receipt
    static void printReceipt(String name, String itemName, int quantity,
                             double subtotalAllPrice, double discount,
                             double vat, double finalPrice) {

        IO.println();
        IO.println("==============================");
        IO.println("      LEXICON CAFE");
        IO.println("==============================");

        IO.println("Customer  : " + name);
        IO.println("Item      : " + itemName + " x " + quantity);

        IO.println(String.format("Subtotal  : %.2f SEK", subtotalAllPrice));

        if (discount > 0) {
            IO.println(String.format("Discount  : -%.2f SEK", discount));
        }

        IO.println(String.format("VAT       : %.2f SEK", vat));
        IO.println("------------------------------");
        IO.println(String.format("TOTAL     : %.2f SEK", finalPrice));

        IO.println("==============================");
        IO.println("   Thank you, " + name + "!");
        IO.println("   See you next time.");
        IO.println("==============================");
    }
}
