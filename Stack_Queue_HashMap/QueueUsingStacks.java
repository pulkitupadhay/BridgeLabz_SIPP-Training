package DSA.Stack_Queue_HashMap;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();

    public void enqueue(int x) {
        stackIn.push(x);
    }

    public int dequeue() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        if (stackOut.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackOut.pop();
    }

    public boolean isEmpty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}
