/*### Challenge 3 – Create an Order Class
Create a second file `Order.java` in the same package.
Move all order data (customer name, item, quantity, price, membership) into fields.
Move all calculations and receipt printing into instance methods.
In `main`, create a `new Order()` object, set its fields, and call `order.printReceipt()`.

> **Think about it:** In your current code, `printReceipt` probably needs several parameters. How many parameters does it need when
the data lives in the object's own fields instead?
*/



package se.lexicon.lexicon.cafe;

import java.util.ArrayList;

public class Order{

    String customerName;
    //String itemName;
    //int quantity;
    //double unitPrice;
    boolean isMember;


    //challenge4- (v1.4)
    ArrayList<LineItem> items =new ArrayList<>();
    //step1 -(v1.4)
    void addItem(LineItem item)
    {
        items.add(item);
    }

    /*
   //step1(v1.3)
    double calculateSubtotal() //calculate the subtotal
    {
        return unitPrice * quantity;
    }
    */

    //step2(v1.4) calculate subtotal all items
    double calculateSubtotal()
    {
        double subtotal =0;
        for(LineItem item:items){
            subtotal =subtotal +item.lineTotal();
        }
        return subtotal;
    }



    //step2(v1.3)
    double calculateDiscount() //calculate the discount
    { 
    double subtotal = calculateSubtotal();
    if(isMember) {
        return subtotal * 0.15;
    }
    else if(subtotal > 150)
    {
        return subtotal * 0.10;
    }else
    {
        return 0;
    }
   }
   //step3(v1.3) calculate price after discount
   double calculatePriceAfterDiscount()//calculate price after discount
   {
        double subtotal= calculateSubtotal();
        double discount = calculateDiscount();
        return subtotal - discount;
   }
   //step4(v1.3) calculate vat
    double calculateVAT()
    {
        double priceAfterDiscount = calculatePriceAfterDiscount();
        return priceAfterDiscount *0.12;
    }

   //step5(v1.3) calculate total
    double calculateTotal()
    {
        double priceAfterDiscount = calculatePriceAfterDiscount();
        double vat =calculateVAT();
        return priceAfterDiscount + vat;
    }
    //step6(v1.3)    and (v1.4) small change all item in customer
    void printReceipt()
    {
        double subtotal = calculateSubtotal();
        double discount=calculateDiscount();
        double vat =calculateVAT();
        double total =calculateTotal();

        IO.println ("-------------------------------");
        IO.println("          LEXICAFE"              );
        IO.println("---------------------------------");

        IO.println ("Customer: " + customerName);
        IO.println("-----------------------------------");
       //  step6(v1.3)  IO.println ("Item Name: " + itemName  + "x" + quantity);
        // step6(v1.4) every item for arraylist

        for(LineItem item: items){
            IO.println(String.format("%-15s  x%d  %.2f SEK",
                    item.itemName,item.quantity,item.lineTotal()));
        }



        IO.println(String.format("Subtotal: %.2f", subtotal));
        IO.println(String.format("Discount: %.2f", discount));
        IO.println(String.format("VAT: %.2f", vat));
        IO.println("============================");
        IO.println (String.format("Total : %.2f  SEK", total));
        IO.println("===============================");
        IO.println ("Thank you " + customerName);
        IO.println("Have a nice day");


    }
    }

