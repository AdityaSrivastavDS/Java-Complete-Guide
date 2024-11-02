//Implementation of stack using LinkedList

import java.util.LinkedList;

public class LinkedListStackExample {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
