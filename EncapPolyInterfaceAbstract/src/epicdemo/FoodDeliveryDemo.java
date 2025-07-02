package epicdemo;

import java.util.*;

//Abstract Class: FoodItem
abstract class FoodItem {
 private String itemName;
 private double price;
 private int quantity;

 public FoodItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 public String getItemName() { return itemName; }
 public double getPrice() { return price; }
 public int getQuantity() { return quantity; }

 public abstract double calculateTotalPrice();

 public void getItemDetails() {
     System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
 }
}

//Interface: Discountable
interface Discountable {
 double applyDiscount();
 String getDiscountDetails();
}

//Veg Item
class VegItem extends FoodItem implements Discountable {
 public VegItem(String itemName, double price, int quantity) {
     super(itemName, price, quantity);
 }

 @Override
 public double calculateTotalPrice() {
     return getPrice() * getQuantity();
 }

 @Override
 public double applyDiscount() {
     return calculateTotalPrice() * 0.05; // 5% discount
 }

 @Override
 public String getDiscountDetails() {
     return "5% discount on Veg Item";
 }
}

//Non-Veg Item
class NonVegItem extends FoodItem implements Discountable {
 public NonVegItem(String itemName, double price, int quantity) {
     super(itemName, price, quantity);
 }

 @Override
 public double calculateTotalPrice() {
     return getPrice() * getQuantity() + 20; // ₹20 extra charge
 }

 @Override
 public double applyDiscount() {
     return calculateTotalPrice() * 0.10; // 10% discount
 }

 @Override
 public String getDiscountDetails() {
     return "10% discount on Non-Veg Item";
 }
}

//Main Class
public class FoodDeliveryDemo {
 public static void main(String[] args) {
     List<FoodItem> order = new ArrayList<>();
     order.add(new VegItem("Paneer Butter Masala", 200, 2));
     order.add(new NonVegItem("Chicken Biryani", 250, 1));

     for (FoodItem item : order) {
         item.getItemDetails();
         double total = item.calculateTotalPrice();
         double discount = 0;

         if (item instanceof Discountable) {
             Discountable d = (Discountable) item;
             discount = d.applyDiscount();
             System.out.println(d.getDiscountDetails());
         }

         double finalAmount = total - discount;
         System.out.println("Total (after discount): ₹" + finalAmount);
         System.out.println("--------------------------------");
     }
 }
}
