package epicdemo;

import java.util.*;

//Abstract Class: Product
abstract class Product {
 private int productId;
 private String name;
 private double price;

 public Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }

 public int getProductId() { return productId; }
 public void setProductId(int productId) { this.productId = productId; }

 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 public double getPrice() { return price; }
 public void setPrice(double price) { this.price = price; }

 public abstract double calculateDiscount();
}

//Interface: Taxable
interface Taxable {
 double calculateTax();
 String getTaxDetails();
}

//Electronics product
class Electronics extends Product implements Taxable {
 public Electronics(int productId, String name, double price) {
     super(productId, name, price);
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.10;
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.18;
 }

 @Override
 public String getTaxDetails() {
     return "18% GST applied.";
 }
}

//Clothing product
class Clothing extends Product implements Taxable {
 public Clothing(int productId, String name, double price) {
     super(productId, name, price);
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.15;
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.05;
 }

 @Override
 public String getTaxDetails() {
     return "5% GST applied.";
 }
}

//Grocery product
class Groceries extends Product {
 public Groceries(int productId, String name, double price) {
     super(productId, name, price);
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.05;
 }
}

//Main class
public class ECommerceDemo {
 public static void printFinalPrice(List<Product> products) {
     for (Product p : products) {
         double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
         double discount = p.calculateDiscount();
         double finalPrice = p.getPrice() + tax - discount;
         System.out.println(p.getName() + " Final Price: " + finalPrice);
     }
 }

 public static void main(String[] args) {
     List<Product> products = new ArrayList<>();
     products.add(new Electronics(1, "Smartphone", 20000));
     products.add(new Clothing(2, "T-Shirt", 1000));
     products.add(new Groceries(3, "Rice", 500));

     printFinalPrice(products);
 }
}
