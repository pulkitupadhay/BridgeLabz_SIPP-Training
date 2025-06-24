package Constructor;

public class Library {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price +
                           ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
    	Library b = new Library("Effective Java", "Joshua Bloch", 599.99);
        b.displayBook();
        b.borrowBook();
        b.borrowBook();
    }
}
