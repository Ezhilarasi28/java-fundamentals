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
// TC04: Non-member, order exactly 150 SEK – No discount.


package se.lexicon.lexicon.cafe;

import java.util.Scanner;

public class CafeApp {
    static void main()
    {
        //int itemNum1 = 0, itemNum2 = 0, itemNum3 = 0, itemNum4 = 0, itemNum5 = 0;
        //double price1 = 0, price2 = 0, price3 = 0, price4 = 0, price5 = 0;

        Scanner username = new Scanner(System.in);
        IO.println(" **** Welcome to lexiCafe ****");

        IO.println(" " + "--- What is your name?--- " + " ");
        String name = username.nextLine();
        IO.println(" Hi " + " " + name + " !!!!! ");

        String item1Name = "Espresso ";
        int itemNum1 = 1;
        double price1 = 35.00;

        String item2Name = "Latte";
        int itemNum2 = 2;
        double price2 = 70.00;

        String item3Name = "Cappuccino";
        int itemNum3 = 3;
        double price3 = 79.00;

        String item4Name ="sandwich";
        int itemNum4 = 4;
        double price4 = 45.00;

        String item5Name = "croissant";
        int itemNum5 = 5;
        double price5 = 30.00;
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

       /* IO.println(itemNum1 + "." + item1Name + "=" + price1 +"sek"); */ IO.println(String.format("%d. %-15s %6.2f SEK", itemNum1, item1Name, price1));
      /*  IO.println(itemNum2 + "." + item2Name + "=" + price2+"sek");  */ IO.println(String.format("%d. %-15s %6.2f SEK", itemNum2, item2Name, price2));
       /* IO.println(itemNum3 + "." + item3Name + "=" + price3 +"sek"); */ IO.println(String.format("%d. %-15s %6.2f SEK", itemNum3, item3Name, price3));
       /* IO.println(itemNum4 + ". " +item4Name +"=" + price4 +"sek");*/  IO.println(String.format("%d. %-15s %6.2f SEK", itemNum4, item4Name, price4));
      /*  IO.println(itemNum5 + "." + item5Name + "=" + price5 +"sek"); */ IO.println(String.format("%d. %-15s %6.2f SEK", itemNum5, item5Name, price5));

        IO.println("-----------------------------");

        IO.println("Which item menu do you want to choose (1-5):");
        int itemNum = username.nextInt();

        IO.println("How many would you like:");
        int quantity = username.nextInt();

        IO. println("Do you have the loyalty membership card (yes/no): ");
        String card = username.nextLine();
        double eachItemPrice = 0;

        switch(itemNum) {
            case 1:
                eachItemPrice = price1;
                break;
                case 2:
                    eachItemPrice = price2;
                    break;
                    case 3:
                        eachItemPrice = price3;
                            break;
                            case 4:
                                eachItemPrice = price4;
                                break;
                                case 5:
                                    eachItemPrice = price5;
                                    break;
                                    default:
                                        IO.println("Invalid input");
                                        return;
        }
        double subtotalAllPrice = eachItemPrice * quantity; //overall total calculation
        double discount = 0;//next discount calculation


        if(card.equals("yes")) //. equals is string method compare the text
        {
            discount =subtotalAllPrice * 0.15;
           // IO.println("Person is applicable for 15% :" + discount =subtotalAllPrice * 0.15);
        }
        else if(subtotalAllPrice>=150)
        {
            discount =subtotalAllPrice * 0.10;
           // IO.println("person is applicable for 10%: " + discount =subtotalAllPrice * 0.10);
        }
        else
    {
        discount = 0;
        //IO. println("User dont get the discount:" + discount =0);
    }

    }
}
