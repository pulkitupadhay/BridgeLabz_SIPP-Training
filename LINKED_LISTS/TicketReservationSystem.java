package DSA.LINKED_LISTS;

public class TicketReservationSystem {
    static class TicketNode {
        int ticketId;
        String customerName, movieName, seatNumber, bookingTime;
        TicketNode next;

        TicketNode(int id, String customer, String movie, String seat, String time) {
            ticketId = id;
            customerName = customer;
            movieName = movie;
            seatNumber = seat;
            bookingTime = time;
        }
    }

    TicketNode head = null;

    void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode node = new TicketNode(id, customer, movie, seat, time);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = node;
            node.next = head;
        }
    }

    void removeTicket(int id) {
        if (head == null) return;
        if (head.ticketId == id && head.next == head) {
            head = null;
            return;
        }
        TicketNode temp = head, prev = null;
        do {
            if (temp.ticketId == id) {
                if (prev != null) prev.next = temp.next;
                else {
                    TicketNode last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        TicketNode temp = head;
        do {
            System.out.println("TicketID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByCustomer(String name) {
        if (head == null) return;
        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                System.out.println("Ticket found: " + temp.ticketId);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No ticket found for customer " + name);
    }

    void searchByMovie(String movie) {
        if (head == null) return;
        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                System.out.println("Ticket for movie: " + temp.ticketId);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No ticket found for movie " + movie);
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        trs.addTicket(1, "Alice", "Movie A", "A1", "10:00 AM");
        trs.addTicket(2, "Bob", "Movie B", "B2", "12:00 PM");
        trs.addTicket(3, "Charlie", "Movie A", "A2", "10:00 AM");
        trs.displayTickets();
        trs.searchByCustomer("Alice");
        trs.searchByMovie("Movie A");
        trs.removeTicket(2);
        trs.displayTickets();
        System.out.println("Total tickets: " + trs.countTickets());
    }
}

