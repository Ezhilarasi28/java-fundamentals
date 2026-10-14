/*### Challenge 4 – Multiple Items per Order
Allow a single customer to order several different items before the receipt is printed.

Create a third file `LineItem.java` in the same package to represent one line on the receipt (item name, unit price, quantity, and a `lineTotal()` helper).

In `Order.java`, replace the single-item fields with an `ArrayList<LineItem>` and an `addItem()` method. Update all
calculation methods to sum across every line item in the list.

In `CafeApp.java`, add an inner loop inside the customer turn. Show the menu once, ask for membership,
then keep prompting for items until the cashier enters `0`. The discount and VAT rules are unchanged — they apply to the order subtotal as before.*/



package se.lexicon.lexicon.cafe;

public class LineItem {
    String itemName;     //store the item details
    double unitPrice;
    int quantity;
    double lineTotal()
    {
        return unitPrice *quantity;
    }
}
