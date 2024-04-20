// Implementation of a basic singly linked list in Java

// Define the main class for the linked list implementation
class Insertion {
    
    // Define the Node class, representing individual elements in the linked list
    class Node {
        String data; // Data stored in the node
        Node next;   // Reference to the next node in the sequence

        // Constructor to initialize a node with given data
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Reference to the first node in the linked list

    // Method to add a new node with data at the beginning of the list (addFirst operation)
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new node with the given data
        
        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
            return;
        }
        
        // Otherwise, update the new node's reference to point to the current head,
        // and then set the head to the new node
        newNode.next = head;
        head = newNode;
    }

    // Method to add a new node with data at the end of the list (addLast operation)
    public void addLast(String data) {
        Node newNode = new Node(data); // Create a new node with the given data
        
        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
            return;
        }
        
        // Traverse the list to find the last node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        
        // Update the reference of the last node to point to the new node
        currNode.next = newNode;
    }

    // Method to print the elements of the linked list
    public void printList() {
        if (head == null) {
            // If the list is empty, print a message and return
            System.out.println("List is empty");
            return;
        }

        // Traverse the list and print the data of each node
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL"); // Print NULL to indicate the end of the list
    }

    // Main method to test the linked list implementation
    public static void main(String args[]) {
        Insertion list = new Insertion(); // Create an instance of the linked list
        
        // Add elements to the list using addFirst
        list.addFirst("a");
        list.addFirst("is");
        list.printList(); // Print the list after adding "is" and "a" at the beginning

        // Add elements to the list using addLast
        list.addLast("singly");
        list.addLast("list");
        list.printList(); // Print the list after adding "singly" and "list" at the end
    }
}
