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

import java.util.Scanner;

public class LexiCafeApp {
    static void main() {
        Scanner username = new Scanner(System.in);                    //create a scanner object to read user input
        int customersServed = 0;                                       //Count customers
        double totalRevenue = 0;                                        //store money from all customers
        //step1:welcome the customer and asking the name

        IO.println("***** Welcome to LexiCafe App *****");
        while (true)                                                    //reapt for the mutiple customers
        {
            IO.println("next Customer name(or 'done' to close):");
            String name = username.nextLine();
            if (name.trim().isEmpty())                                   //check the name is empty
            {
                IO.println("Enter Customer name:");
                continue;
            }
            if(name.equalsIgnoreCase("done"))                  //check the cashier enter done
            {
                break;
            }

        //IO.println("what is your name?");
        //String name = username.nextLine(); //store the entered name in a string variable
        IO.println("Hi  " + name + " !!Here is our menu!!");
        IO.println();

        //step2: display the cafe menu
        displayMenu();                                             //call the displaymenu() to show the items and prices
            /*  challenge-1 multiple-customer old (version 1.1)
        //step3:get the item number
        IO.println("Enter item number (1-5):");                      //get the item from the customer 1 to 5
        int itemNumber = username.nextInt();                           //stored the selected number in itemNumber
        if (itemNumber < 1 || itemNumber > 5)                          //check the condition item number is outside 1 to5
        {
            IO.println("Invalid input");
            //clear the enter key
            username.nextLine(); // username.close();
            // return;  //stop the main method
            continue;
        }
        */
            // step-3 challenge-2 input validation and error handling -(version 1.2)
int itemNumber;
while (true) {
    IO.println ("enter item number(1-5):");//check the input is not a whole number
    if(!username.hasNextInt()){
        IO.println("Invalid item number!");
        username.next();
        continue;
    }
    itemNumber = username.nextInt();
    username.nextLine();
    if (itemNumber >=1 && itemNumber <= 5) {
        break;
    }
    IO.println("invalid item number");

}

/* challenge 1 multi-customer old (version 1.1)
//step4: get the quantity
        IO.println("how many?");                                             //get the quantity
        int quantity = username.nextInt();

        //check the quantity is valid
        if (quantity <= 0) {
            IO.println("Invalid input");
            username.nextLine();                                            //clear the enter key
            // username.close();
            // return;
            //go to the next customer
            continue;
        }
*/
            //step-4 challenge -2 input validation and error handling(version 1.2)
            //get the quantity
            int quantity;
            while(true) {
                IO.println("How many?");
                if(!username.hasNextInt()){
                    IO.println("Invalid item number!");
                    username.nextLine();
                    continue;
                }
                quantity = username.nextInt();
                username.nextLine();
                if(quantity > 0) {
                    break;
                }
                IO.println("invalid item number");
            }
            /* Challenge-1 multi customer old (version 1.1)
//step5:check the loyalty membership
        IO.print("loyalty member? (yes/no):");                                     //check the loyalty membership
        String answer = username.next();
        boolean isMember = answer.equalsIgnoreCase("yes");//true means member.false means non member
        username.nextLine();
*/
//step5: challenge -2 loyalty membership validation(version 1.2)
 boolean isMember;
 while(true) {
     IO.println("loyalty member? (yes/no):");
     String answer = username.nextLine() .trim();
     if(answer.equalsIgnoreCase("yes")) {
         isMember =true;
         break;
     }else if(answer.equalsIgnoreCase("no")) {
         isMember =false;
         break;
     }else
     {
         IO.println("Invalid input!");
     }
 }
//step 6:find item name and price
        String itemName = getItemName(itemNumber); //call getitemname() using selected item number and stored the returned item name in the item name
        double unitPrice = getItemPrice(itemNumber);//call getitemprice() using selected item number and stored the returned item name in the item name


//step 7:subtotal calculation
        double subtotal = calculateSubtotal(unitPrice, quantity);              //call calculate subtotal and formula:unit price * quantity

//step 8:calculate the discount
        double discount = calculateDiscount(subtotal, isMember);             //members get 15% and non-member get 10%

//step9:calculate price after discount
        double priceAfterDiscount = calculatePriceAfterDiscount(subtotal, discount);           //subtract the discount from subtotal using method

//step10:calculate the vat
//cal the calculate vat to calculate 12%vat and vat is calculated after the discount
        double vat = calculateVAT(priceAfterDiscount);

//step11:calculate the final total
        double total = calculateTotal(priceAfterDiscount, vat);                          //add vat to the price after the discount
        //print customer receipt
        printReceipt(name, itemName, quantity, subtotal, discount, vat, total);

        //step12: count the customers
        customersServed++;
        //step-13 //add the customers bill daily revenue
        totalRevenue = totalRevenue + total;
    }  //loop end
    //step-14 print end of day report
    IO.println("-----------------------------");
    IO.println("  End of the Report");
    IO.println("-----------------------------");
    IO.println("customers served:"+ customersServed);                                       //display the total customers
    IO.println(String.format("Total revenue : %.2f sek",totalRevenue));
    IO.println("---------------------------------");
    username.close();
}

    //method1:display cafe menu
//used void bescause the method does not return a value
    static void displayMenu() {
        IO.println("----------------------------");
        IO.println("   Lexicon Cafe");
        IO.println("---------------------------");
        IO.println("1. Espresso         25.00 SEK");
        IO.println("2. Cappuccino       35.00 SEK");
        IO.println("3. Latte            45.00 SEK");
        IO.println("4. Croissant        55.00 SEK");
        IO.println("5. Sandwich         60.00 SEK");

        IO.println("------------------------------");
        IO.println();
    }

    //method2:item name
//receives the selected item number and returns the item name as string
    static String getItemName(int itemNumber) {
        return switch (itemNumber) {
            case 1 ->"Espresso";
            case 2 -> "Cappuccino";
            case 3 ->"Latte";
            case 4 -> "Croissant";
            case 5->"Sandwich";
            default-> "unknown";

        };
    }

    //method3: item price
    static double getItemPrice(int itemNumber) {
       return switch (itemNumber) {
            case 1 -> 25.00;

            case 2 -> 35.00;

            case 3 -> 45.00;

            case 4 -> 55.00;

            case 5 -> 60.00;
            default -> 0;
        };
    }

    //method4:calculate subtotal
//receives unit price and quantity and returns the price before discount and vat
    static double calculateSubtotal(double unitPrice, int quantity) {
        //formula:subtotal=unitprice * quantity
        return unitPrice * quantity;
    }

    //method5: calculate discount
     //receives subtotal and membership status returns the discount amount in sek
    static double calculateDiscount(double subtotal, boolean isMember) {
        //check the customer is the loyalty member
        if (isMember) {

            return subtotal * 0.15;
        }
        else if (subtotal > 150) {
            return subtotal * 0.10;
        }
        else
        {
            return 0;
        }
    }
        //method:6 calculate price after discount
        static double calculatePriceAfterDiscount ( double subtotal, double discount)
        {
            return subtotal - discount;

        }
        //method7:calculate the vat
        static double calculateVAT ( double priceAfterDiscount)
        {
            return priceAfterDiscount * 0.12;
        }
        //method8: calculate final total
        static double calculateTotal ( double priceAfterDiscount, double vat)
        {
            return priceAfterDiscount + vat;
        }
        //method:9 customer receipt print
        static void printReceipt (String name, String itemName ,int quantity, double subtotal,
        double discount, double vat, double total)
        {
            // Display receipt heading
            IO.println("==============================");
            IO.println("      LEXICON CAFE");
            IO.println("==============================");
            IO.println("Customer  : " + name);
            IO.println("Item      : " + itemName + " x " + quantity);
            // Display subtotal with two decimal places
            // %.2f means show two digits after the decimal point
            // %n means move to the next line
            IO.println(String.format("Subtotal  : %.2f SEK", subtotal));
            IO.println(String.format("Discount  : -%.2f SEK%n", discount));
            IO.println(String.format("VAT       : %.2f SEK%n", vat));
            IO.println("------------------------------");
            IO.println(String.format("TOTAL     : %.2f SEK%n", total));
            IO.println("---------------------------------");
            IO.println("   Thank you, " + name + "!");
            IO.println("   See you next time.");
            IO.println("----------------------------------");
        }
}






