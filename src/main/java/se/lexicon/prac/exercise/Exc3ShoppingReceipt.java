package se.lexicon.prac.exercise;

public class Exc3ShoppingReceipt {
    static void main()
    {
        String item1 ="Apple"; //first item
        int quantity1 = 2;
        double price1 = 60.00;

        String item2 ="mango"; //second item
        int quantity2 = 5;
        double price2 = 99.99;

        String item3 = "pineapple"; //third item
        int quantity3 = 3;
        double price3 = 100.00;

        double total1 =quantity1* price1;  //calculate the items
        double total2 =quantity2 * price2;
        double total3 = quantity3 * price3;
        double grandTotal = total1 +total2 +total3;

        IO. println("-----------------------------");
        IO.println("             Receipt ");
        IO.println("------------------------------");
        IO.println(item1 + "  " + quantity1 + " x " + price1 + " = " + total1 + " SEK");
        IO.println(item2 + "  " + quantity2 + " x " + price2 + " = " + total2 + " SEK");
        IO.println(item3 + "  " + quantity3 + " x " + price3 + " = " + total3 + " SEK");

        IO.println("------------------------------");
        IO.println("Grand Total: " + grandTotal + " SEK");
        IO.println("-------------------------------");
    }

}
