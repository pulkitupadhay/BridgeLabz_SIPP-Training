package Day_4;

public class ParcelTracker {
    static class Node {
        String stage;
        Node next;

        Node(String stage) {
            this.stage = stage;
        }
    }

    Node head = null;

    void initChain() {
        addEnd("Packed");
        addEnd("Shipped");
        addEnd("In Transit");
        addEnd("Delivered");
    }

    void addEnd(String s) {
        Node n = new Node(s);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = n;
    }

    void addAfter(String after, String s) {
        Node t = head;
        while (t != null) {
            if (t.stage.equalsIgnoreCase(after)) {
                Node n = new Node(s);
                n.next = t.next;
                t.next = n;
                return;
            }
            t = t.next;
        }
        System.out.println("Stage \"" + after + "\" not found.");
    }

    void loseAfter(String stage) {
        Node t = head;
        while (t != null) {
            if (t.stage.equalsIgnoreCase(stage)) {
                t.next = null;
                System.out.println("Parcel lost after: " + stage);
                return;
            }
            t = t.next;
        }
        System.out.println("Stage \"" + stage + "\" not found.");
    }

    void track() {
        if (head == null) {
            System.out.println("No tracking data.");
            return;
        }

        Node t = head;
        System.out.println("Parcel Path:");
        while (t != null) {
            System.out.println("→ " + t.stage);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        ParcelTracker p = new ParcelTracker();
        p.initChain();
        p.track();

        System.out.println("\nAdding checkpoint: 'At Hub' after 'In Transit'");
        p.addAfter("In Transit", "At Hub");
        p.track();

        System.out.println("\nSimulating parcel lost after 'Shipped'");
        p.loseAfter("Shipped");
        p.track();
    }
}
