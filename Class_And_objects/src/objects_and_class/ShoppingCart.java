package objects_and_class;

import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class ShoppingCart {
    static List<CartItem> cart = new ArrayList<>();

    public static void addItem(String name, double price, int quantity) {
        cart.add(new CartItem(name, price, quantity));
        System.out.println("Item added to cart.");
    }

    public static void removeItem(String name) {
        boolean removed = cart.removeIf(item -> item.itemName.equalsIgnoreCase(name));
        if (removed)
            System.out.println("Item removed from cart.");
        else
            System.out.println("Item not found.");
    }

    public static void displayTotal() {
        double total = 0;
        System.out.println("Cart Items:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - $" + item.price + " x " + item.quantity);
            total += item.getTotal();
        }
        System.out.println("Total Cost: $" + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Total\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = scanner.nextInt();
                    addItem(name, price, qty);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    removeItem(removeName);
                    break;
                case 3:
                    displayTotal();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
