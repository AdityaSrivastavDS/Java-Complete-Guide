/*Blocking Queue (ArrayBlockingQueue or LinkedBlockingQueue for Thread-Safe Queues)
ArrayBlockingQueue or LinkedBlockingQueue are thread-safe implementations, making them suitable for 
concurrent applications. They block if the queue is full or empty, which is helpful in multi-threaded
environments. */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        
        // Producer thread
        new Thread(() -> {
            try {
                queue.put(10);
                queue.put(20);
                queue.put(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        
        // Consumer thread
        new Thread(() -> {
            try {
                System.out.println("Front element: " + queue.take());
                System.out.println("Queue after dequeue: " + queue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
