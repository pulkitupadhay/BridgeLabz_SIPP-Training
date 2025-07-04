package DSA.LINKED_LISTS;

public class MovieManagementSystem {
    static class MovieNode {
        String title, director;
        int year;
        double rating;
        MovieNode next, prev;
        
        MovieNode(String t, String d, int y, double r) {
            title = t;
            director = d;
            year = y;
            rating = r;
        }
    }

    MovieNode head, tail;

    void addAtBeginning(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        node.next = head;
        if (head != null) head.prev = node;
        else tail = node;
        head = node;
    }

    void addAtEnd(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        if (tail == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void addAtPosition(int pos, String t, String d, int y, double r) {
        if (pos == 0) {
            addAtBeginning(t, d, y, r);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < pos && temp != null; i++) temp = temp.next;
        if (temp == null) return;
        MovieNode node = new MovieNode(t, d, y, r);
        node.next = temp.next;
        if (temp.next != null) temp.next.prev = node;
        else tail = node;
        node.prev = temp;
        temp.next = node;
    }

    void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null && !temp.title.equals(title)) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Found movie: " + temp.title);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found for director " + director);
    }

    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Found movie: " + temp.title);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies with rating " + rating);
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + ", Dir: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + ", Dir: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                System.out.println("Updated rating for " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.addAtEnd("Inception","Nolan",2010,8.8);
        mms.addAtBeginning("Titanic","Cameron",1997,9.0);
        mms.addAtPosition(1,"Avatar","Cameron",2009,7.9);
        mms.displayForward();
        mms.searchByDirector("Cameron");
        mms.updateRating("Titanic", 9.5);
        mms.removeByTitle("Avatar");
        mms.displayReverse();
    }
}

