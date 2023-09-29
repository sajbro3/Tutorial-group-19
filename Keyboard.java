package Tutorial4SD;

import java.util.*;

class Keyboard {
    public static int getInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            return productId;
        }
    }
}