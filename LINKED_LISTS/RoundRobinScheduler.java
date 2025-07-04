package DSA.LINKED_LISTS;

public class RoundRobinScheduler {
    static class ProcessNode {
        int processId, burstTime, priority;
        ProcessNode next;

        ProcessNode(int id, int burst, int priority) {
            processId = id;
            burstTime = burst;
            this.priority = priority;
        }
    }

    ProcessNode head = null;

    void addProcess(int id, int burst, int priority) {
        ProcessNode node = new ProcessNode(id, burst, priority);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = node;
            node.next = head;
        }
    }

    void removeProcess(int id) {
        if (head == null) return;
        if (head.processId == id && head.next == head) {
            head = null;
            return;
        }
        ProcessNode temp = head, prev = null;
        do {
            if (temp.processId == id) {
                if (prev != null) prev.next = temp.next;
                else {
                    ProcessNode last = head;
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

    void simulateRoundRobin(int quantum) {
        if (head == null) return;
        ProcessNode temp = head;
        int totalTime = 0;
        do {
            if (temp.burstTime > 0) {
                int execTime = Math.min(temp.burstTime, quantum);
                System.out.println("Executing Process " + temp.processId + " for " + execTime + " units");
                temp.burstTime -= execTime;
                totalTime += execTime;
                if (temp.burstTime == 0) {
                    System.out.println("Process " + temp.processId + " completed.");
                    removeProcess(temp.processId);
                }
            }
            temp = temp.next;
        } while (head != null && temp != head);
        System.out.println("Total time elapsed: " + totalTime);
    }

    void displayProcesses() {
        if (head == null) return;
        ProcessNode temp = head;
        do {
            System.out.println("Process " + temp.processId + " Burst: " + temp.burstTime + " Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);
        scheduler.displayProcesses();
        scheduler.simulateRoundRobin(3);
        scheduler.displayProcesses();
    }
}

