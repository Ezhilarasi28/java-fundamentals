/*### Challenge 5 – Graphical User Interface
Replace the console interface with a desktop GUI using **Java Swing** or **JavaFX**.

> **Think about it:** How does the event-driven model of a GUI differ from the top-to-bottom flow of a console app? Which parts
 of your existing code can be reused without change?*/


package se.lexicon.lexicon.cafe;

import javax.swing.*;
import java.awt.*;

public class LexiCafeGUI {

    void main() {

        // Step 1: Create the window
        JFrame window = new JFrame("LexiCafe v1.5");
        window.setSize(600, 650);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 12));


        JLabel welcomeLabel = new JLabel("Welcome to LexiCafe!");
        window.add(welcomeLabel);


        JLabel nameLabel = new JLabel("Customer Name:");
        JTextField nameField = new JTextField(20);

        window.add(nameLabel);
        window.add(nameField);

        // Step 4: Cafe menu
        JLabel menuLabel = new JLabel("Select Item:");

        String[] menuItems = {
                "Espresso - 25 SEK",
                "Cappuccino - 35 SEK",
                "Latte - 45 SEK",
                "Croissant - 55 SEK",
                "Sandwich - 60 SEK"
        };

        JComboBox<String> itemBox = new JComboBox<>(menuItems);

        window.add(menuLabel);
        window.add(itemBox);

        // Step 5: Quantity
        JLabel quantityLabel = new JLabel("Quantity:");

        JSpinner quantitySpinner = new JSpinner(
                new SpinnerNumberModel(1, 1, 100, 1)
        );

        window.add(quantityLabel);
        window.add(quantitySpinner);

        // Step 6: Loyalty membership
        JLabel memberLabel = new JLabel("Loyalty Member:");

        JRadioButton yesButton = new JRadioButton("Yes");
        JRadioButton noButton = new JRadioButton("No");

        noButton.setSelected(true);

        ButtonGroup memberGroup = new ButtonGroup();
        memberGroup.add(yesButton);
        memberGroup.add(noButton);

        window.add(memberLabel);
        window.add(yesButton);
        window.add(noButton);

        // Step 7: Create buttons
        JButton addItemButton = new JButton("Add Item");
        JButton orderButton = new JButton("Place Order");
        JButton newCustomerButton = new JButton("New Customer");

        window.add(addItemButton);
        window.add(orderButton);
        window.add(newCustomerButton);

        // Step 8: Receipt area
        JTextArea receiptArea = new JTextArea(20, 42);
        receiptArea.setEditable(false);
        receiptArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(receiptArea);
        window.add(scrollPane);

        // Step 9: Create an Order object
        // One order for the current customer
        final Order[] currentOrder = {new Order()};

        // Step 10: Add Item button event
        addItemButton.addActionListener( _-> {

            String customerName = nameField.getText().trim();

            // Validate customer name
            if (customerName.isEmpty()) {
                JOptionPane.showMessageDialog(
                        window,
                        "Please enter customer name!"
                );
                return;
            }

            // Read item and quantity
            int selectedItem = itemBox.getSelectedIndex() + 1;
            int quantity = (Integer) quantitySpinner.getValue();

            // Store customer details
            currentOrder[0].customerName = customerName;
            currentOrder[0].isMember = yesButton.isSelected();

            // Create LineItem object
            LineItem item = new LineItem();

            item.itemName = LexiCafeApp.getItemName(selectedItem);
            item.unitPrice = LexiCafeApp.getItemPrice(selectedItem);
            item.quantity = quantity;

            // Add item to the existing order
            currentOrder[0].addItem(item);

            // Show added item
            receiptArea.append(
                    item.itemName + " x " + item.quantity
                            + " = " + String.format("%.2f", item.lineTotal())
                            + " SEK\n"
            );

            JOptionPane.showMessageDialog(
                    window,
                    item.itemName + " added to order!"
            );
        });

        // Step 11: Place Order button event
        orderButton.addActionListener(_ -> {

            Order order = currentOrder[0];

            if (order.items.isEmpty()) {
                JOptionPane.showMessageDialog(
                        window,
                        "Please add at least one item!"
                );
                return;
            }

            // Update customer details
            order.customerName = nameField.getText().trim();

            if (order.customerName.isEmpty()) {
                JOptionPane.showMessageDialog(
                        window,
                        "Please enter customer name!"
                );
                return;
            }

            order.isMember = yesButton.isSelected();

            // Reuse existing Order methods
            double subtotal = order.calculateSubtotal();
            double discount = order.calculateDiscount();
            double vat = order.calculateVAT();
            double total = order.calculateTotal();

            // Build receipt text
            StringBuilder receipt = new StringBuilder();

            receipt.append("==============================\n");
            receipt.append("          LEXICAFE\n");
            receipt.append("==============================\n");
            receipt.append("Customer: ")
                    .append(order.customerName)
                    .append("\n");
            receipt.append("------------------------------\n");

            // Show every item in the order
            for (LineItem item : order.items) {
                receipt.append(String.format(
                        "%-15s x%d  %.2f SEK%n",
                        item.itemName,
                        item.quantity,
                        item.lineTotal()
                ));
            }

            receipt.append("------------------------------\n");
            receipt.append(String.format("Subtotal: %.2f SEK%n", subtotal));
            receipt.append(String.format("Discount: -%.2f SEK%n", discount));
            receipt.append(String.format("VAT (12%%): %.2f SEK%n", vat));
            receipt.append("==============================\n");
            receipt.append(String.format("TOTAL: %.2f SEK%n", total));
            receipt.append("==============================\n");
            receipt.append("Thank you, ")
                    .append(order.customerName)
                    .append("!\n");
            receipt.append("Have a nice day!");

            // Display receipt in GUI
            receiptArea.setText(receipt.toString());

            // Prevent adding more items after placing order
            addItemButton.setEnabled(false);
            orderButton.setEnabled(false);
        });

        // Step 12: New Customer button event
        newCustomerButton.addActionListener(_ -> {

            // Create a fresh order
            currentOrder[0] = new Order();

            // Clear all fields
            nameField.setText("");
            itemBox.setSelectedIndex(0);
            quantitySpinner.setValue(1);
            noButton.setSelected(true);
            receiptArea.setText("");

            // Enable buttons again
            addItemButton.setEnabled(true);
            orderButton.setEnabled(true);
        });

        // Step 13: Centre and show window
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
