// Class representing a single node in a singly linked list
class Node {
    int data; // Data held by the node
    Node next; // Pointer to the next node

    // Constructor to initialize node data and set the next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Class implementing singly linked list operations
class SinglyLinkedList {
    Node head; // Head of the list

    // Method to insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node with the data
        newNode.next = head; // Point new node's next to current head
        head = newNode; // Make new node the head
    }

    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) { // If the list is empty
            head = newNode; // Make new node the head
            return;
        }
        Node current = head; // Start from head
        while (current.next != null) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Link last node to the new node
    }

    // Method to insert a node at a specified position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data); // Create a new node
        if (position == 0) { // If position is 0, insert at the beginning
            insertAtBeginning(data);
            return;
        }
        Node current = head; // Start from head
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next; // Move to the next node
        }
        if (current == null) return; // If position is out of bounds
        newNode.next = current.next; // Link new node to next node
        current.next = newNode; // Link current node to new node
    }

    // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return; // If the list is empty
        if (head.data == value) { // If head holds the value
            head = head.next; // Move head to the next node
            return;
        }
        Node current = head; // Start from head
        while (current.next != null && current.next.data != value) {
            current = current.next; // Move to the next node
        }
        if (current.next == null) return; // If value not found
        current.next = current.next.next; // Remove the node from the list
    }

    // Method to delete a node at a specified position
    public void deleteAtPosition(int position) {
        if (head == null) return; // If the list is empty
        if (position == 0) { // If deleting the head node
            head = head.next; // Move head to the next node
            return;
        }
        Node current = head; // Start from head
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next; // Move to the next node
        }
        if (current == null || current.next == null) return; // If position is out of bounds
        current.next = current.next.next; // Remove the node from the list
    }

    // Method to traverse and print the list
    public void traverse() {
        Node current = head; // Start from head
        while (current != null) { // Traverse until the end of the list
            System.out.print(current.data + " -> "); // Print the data of each node
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }
}
