package DSA.LINKED_LISTS;

public class TaskScheduler {
    static class TaskNode {
        int taskId, priority;
        String taskName, dueDate;
        TaskNode next;

        TaskNode(int id, String name, int priority, String date) {
            taskId = id;
            taskName = name;
            this.priority = priority;
            dueDate = date;
        }
    }

    TaskNode head = null, current = null;

    void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) temp = temp.next;
            node.next = head;
            temp.next = node;
            head = node;
        }
    }

    void addAtEnd(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = node;
            node.next = head;
        }
    }

    void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos == 0) {
            addAtBeginning(id, name, priority, date);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < pos && temp.next != head; i++) temp = temp.next;
        TaskNode node = new TaskNode(id, name, priority, date);
        node.next = temp.next;
        temp.next = node;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.taskId == id && head.next == head) {
            head = null;
            return;
        }
        TaskNode temp = head;
        TaskNode prev = null;
        do {
            if (temp.taskId == id) {
                if (prev != null) prev.next = temp.next;
                else {
                    TaskNode tail = head;
                    while (tail.next != head) tail = tail.next;
                    head = head.next;
                    tail.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentAndMoveNext() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println("Current Task: " + current.taskName + " Priority: " + current.priority);
            current = current.next;
        }
    }

    void displayAllTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println("TaskID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        if (head == null) return;
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Found Task: " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No task found with priority " + priority);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addAtEnd(1,"Email Review",2,"2025-07-05");
        ts.addAtBeginning(2,"Prepare Report",1,"2025-07-04");
        ts.addAtPosition(1,3,"Team Meeting",3,"2025-07-06");
        ts.displayAllTasks();
        ts.searchByPriority(1);
        ts.viewCurrentAndMoveNext();
        ts.removeById(2);
        ts.displayAllTasks();
    }
}

