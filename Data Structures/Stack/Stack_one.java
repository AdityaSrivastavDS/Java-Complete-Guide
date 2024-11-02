//Implementation of stack using stack class in java

import java.util.Stack;

public class Stack_one {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Peek the top element
        System.out.println("Top element: " + stack.peek());
        
        // Pop elements from stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}

