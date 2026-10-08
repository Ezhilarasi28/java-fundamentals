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


package se.lexicon.lexicon.cafe;

public class CafeApp {
}
