package objects_and_class;

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails(int quantity) {
        double total = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();

        System.out.print("Enter Item Code: ");
        item.itemCode = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Item Name: ");
        item.itemName = scanner.nextLine();

        System.out.print("Enter Price: ");
        item.price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("\n--- Item Details ---");
        item.displayDetails(quantity);
    }
}
