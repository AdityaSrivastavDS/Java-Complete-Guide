/*Using PriorityQueue
PriorityQueue is useful when you need elements to be dequeued in a specific order (e.g., natural 
order or a custom comparator). This does not follow the strict FIFO order but can be useful for 
priority-based processing. */

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        
        queue.add(30);
        queue.add(10);
        queue.add(20);
        
        System.out.println("Front element (smallest): " + queue.peek());
        
        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Queue after dequeue: " + queue);
    }
}
