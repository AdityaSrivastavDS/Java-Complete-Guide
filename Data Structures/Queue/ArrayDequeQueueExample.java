/*Using ArrayDeque
ArrayDeque is a more efficient alternative to LinkedList for implementing a queue as it’s faster and 
doesn’t have the overhead of linked nodes. */

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        System.out.println("Front element: " + queue.peek());
        
        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Queue after dequeue: " + queue);
    }
}
