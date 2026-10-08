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
// TC05: Non-member, order exactly 150 SEK – No discount.


package se.lexicon.lexicon.cafe;

import java.util.Scanner;

public class CafeApp {
    static void main()
    {
        Scanner username = new Scanner(System.in);
        IO.println(" **** Welcome to lexiCafe ****");

            IO.println(" " + "--- What is your name?--- " + " ");
            String name = username.nextLine();
            IO.println(" Hi " + " " + name + " !!!!! ");
            IO.println(" Here is the menu ");
            IO.println("-------------------------");
            IO.println("        LexiCafe         ");
            IO.println("-------------------------");

            String item1name = "Espresso ";
            int itemNum1 = 1;
            double price1 = 35.00;

            String item2 = "Latte";
            int itemNum2 =2;
            double price2 = 70.00;

            String item3 = "Cappuccino";
            int itemNum3 = 3;
            double price3 = 79.00;

            String item4 = "sandwich";
            int itemNum4 = 4;
            double price4 = 45.00;

            String item5 = "croissant";
            int itemNum5 = 5;
            double price5 = 30.00;



    }
}
