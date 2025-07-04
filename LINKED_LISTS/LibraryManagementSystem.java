package DSA.LINKED_LISTS;

public class LibraryManagementSystem {
    static class BookNode {
        String title, author, genre;
        int bookId;
        boolean available;
        BookNode next, prev;

        BookNode(String title, String author, String genre, int id, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = id;
            this.available = available;
        }
    }

    BookNode head = null, tail = null;

    void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        BookNode node = new BookNode(title, author, genre, id, available);
        node.next = head;
        if (head != null) head.prev = node;
        else tail = node;
        head = node;
    }

    void addAtEnd(String title, String author, String genre, int id, boolean available) {
        BookNode node = new BookNode(title, author, genre, id, available);
        if (tail == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void addAtPosition(int pos, String title, String author, String genre, int id, boolean available) {
        if (pos == 0) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < pos && temp != null; i++) temp = temp.next;
        if (temp == null) return;
        BookNode node = new BookNode(title, author, genre, id, available);
        node.next = temp.next;
        if (temp.next != null) temp.next.prev = node;
        else tail = node;
        node.prev = temp;
        temp.next = node;
    }

    void removeById(int id) {
        BookNode temp = head;
        while (temp != null && temp.bookId != id) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + temp.title + " by " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("Found: " + temp.title);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No books found by author " + author);
    }

    void updateAvailability(int id, boolean available) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = available;
                System.out.println("Updated availability for book " + temp.title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " Available: " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " Available: " + temp.available);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();
        lib.addAtEnd("Book A","Author X","Fiction",101,true);
        lib.addAtBeginning("Book B","Author Y","Drama",102,false);
        lib.addAtPosition(1,"Book C","Author X","Sci-Fi",103,true);
        lib.displayForward();
        lib.searchByAuthor("Author X");
        lib.updateAvailability(103,false);
        lib.removeById(101);
        lib.displayReverse();
        System.out.println("Total Books: " + lib.countBooks());
    }
}

