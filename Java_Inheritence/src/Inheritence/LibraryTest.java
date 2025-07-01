package Inheritence;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2022, "John Doe", "Software Engineer and Author.");
        a.displayInfo();
    }
}
