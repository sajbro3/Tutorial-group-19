package Tutorial4SD;


import java.io.*;
import java.util.*;

class CashRegister {
    private Map<Integer, Product> productMap;

    public CashRegister() {
        this.productMap = new HashMap<>();
    }

    public void loadProductsFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            Product product = new Product(id, name, price);
            productMap.put(id, product);
        }
        reader.close();
    }

    public void processTransaction(int productId) {
        Product product = productMap.get(productId);
        if (product != null) {
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Price: $" + product.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }
}