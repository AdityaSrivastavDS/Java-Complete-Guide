/*Custom Queue Implementation Using a Linked List
This implementation uses a linked list for the queue, which is dynamic in size and doesn’t need 
manual size management. */


public class LinkedListQueue {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node front, rear;

    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public int peek() {
        if (!isEmpty()) {
            return front.data;
        }
        return -1;
    }

    public boolean isEmpty() {
        return front == null;
    }
    
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Front element: " + queue.peek());
        
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}
