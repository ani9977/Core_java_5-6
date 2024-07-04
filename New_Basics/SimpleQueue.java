import java.util.ArrayDeque;
import java.util.Queue;

public class SimpleQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(5); // Queue with capacity of 5

        // Adding elements to the queue using add() method
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Attempting to add an element exceeding the queue's capacity
        if (!queue.offer(60)) {
            System.out.println("Queue full, offer() returned false.");
        }

        // Printing queue contents
        System.out.println("Queue contents: " + queue);
    }
}
