package Tutorial4SD;

import java.io.*;

class Display {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();

        try {
            // Load product information from a file (e.g., products.csv)
            cashRegister.loadProductsFromFile("C:Tutorial4SD\\products.csv");

            // Take input from the keyboard
            int productId = Keyboard.getInput();

            // Process the transaction and display product information
            cashRegister.processTransaction(productId);
        } catch (IOException e) {
            System.out.println("Error loading product data from file.");
        }
    }
}

