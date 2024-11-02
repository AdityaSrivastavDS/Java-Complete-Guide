/*Using the Queue Interface with LinkedList
The LinkedList class implements the Queue interface, so it can be used as a queue. This is useful 
when you need a dynamic queue that grows as needed. */

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        // Peek the front element
        System.out.println("Front element: " + queue.peek());
        
        // Dequeue elements
        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Queue after dequeue: " + queue);
    }
}
