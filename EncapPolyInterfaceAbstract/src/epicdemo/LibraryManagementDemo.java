package epicdemo;

import java.util.*;

//Abstract Class: LibraryItem
abstract class LibraryItem {
 private String itemId;
 private String title;
 private String author;

 public LibraryItem(String itemId, String title, String author) {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
 }

 public String getItemId() { return itemId; }
 public String getTitle() { return title; }
 public String getAuthor() { return author; }

 public abstract int getLoanDuration();

 public void getItemDetails() {
     System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
 }
}

//Interface: Reservable
interface Reservable {
 void reserveItem(String borrower);
 boolean checkAvailability();
}

//Book Class
class Book extends LibraryItem implements Reservable {
 private boolean available = true;

 public Book(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 @Override
 public int getLoanDuration() {
     return 14;
 }

 @Override
 public void reserveItem(String borrower) {
     available = false;
     System.out.println("Book reserved by: " + borrower);
 }

 @Override
 public boolean checkAvailability() {
     return available;
 }
}

//Magazine Class
class Magazine extends LibraryItem implements Reservable {
 private boolean available = true;

 public Magazine(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 @Override
 public int getLoanDuration() {
     return 7;
 }

 @Override
 public void reserveItem(String borrower) {
     available = false;
     System.out.println("Magazine reserved by: " + borrower);
 }

 @Override
 public boolean checkAvailability() {
     return available;
 }
}

//DVD Class
class DVD extends LibraryItem implements Reservable {
 private boolean available = true;

 public DVD(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 @Override
 public int getLoanDuration() {
     return 3;
 }

 @Override
 public void reserveItem(String borrower) {
     available = false;
     System.out.println("DVD reserved by: " + borrower);
 }

 @Override
 public boolean checkAvailability() {
     return available;
 }
}

//Main Class
public class LibraryManagementDemo {
 public static void main(String[] args) {
     List<LibraryItem> items = new ArrayList<>();
     items.add(new Book("B1", "Java Basics", "James Gosling"));
     items.add(new Magazine("M1", "Tech Monthly", "Various"));
     items.add(new DVD("D1", "Inception", "Christopher Nolan"));

     for (LibraryItem item : items) {
         item.getItemDetails();
         System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

         if (item instanceof Reservable) {
             Reservable res = (Reservable) item;
             System.out.println("Available: " + res.checkAvailability());
             res.reserveItem("Alice");
             System.out.println("Now Available: " + res.checkAvailability());
         }

         System.out.println("--------------------------");
     }
 }
}
