import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InventoryGUI {

    JFrame frame;
    JTextField itemField, quantityField;
    JTextArea area;

    public InventoryGUI() {

        frame = new JFrame("Inventory Management System");

        JLabel itemLabel = new JLabel("Item Name:");
        JLabel quantityLabel = new JLabel("Quantity:");

        itemField = new JTextField(15);
        quantityField = new JTextField(15);

        JButton addButton = new JButton("Add Item");
        JButton updateButton = new JButton("Update Item");
        JButton deleteButton = new JButton("Delete Item");
        JButton clearButton = new JButton("Clear");

        area = new JTextArea(12, 30);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String item = itemField.getText();
                String qty = quantityField.getText();

                area.append("Added -> Item: " + item + " | Quantity: " + qty + "\n");

                itemField.setText("");
                quantityField.setText("");
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String item = itemField.getText();
                String qty = quantityField.getText();

                area.append("Updated -> Item: " + item + " | Quantity: " + qty + "\n");

                itemField.setText("");
                quantityField.setText("");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String item = itemField.getText();

                area.append("Deleted -> Item: " + item + "\n");

                itemField.setText("");
                quantityField.setText("");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setText("");
            }
        });

        frame.setLayout(new FlowLayout());

        frame.add(itemLabel);
        frame.add(itemField);

        frame.add(quantityLabel);
        frame.add(quantityField);

        frame.add(addButton);
        frame.add(updateButton);
        frame.add(deleteButton);
        frame.add(clearButton);

        frame.add(area);

        frame.setSize(450, 400);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new InventoryGUI();
    }
}