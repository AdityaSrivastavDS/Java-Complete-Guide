// Class representing a node in a circular linked list
class CircularNode {
    int data; // Data held by the node
    CircularNode next; // Pointer to the next node

    // Constructor to initialize node data
    CircularNode(int data) {
        this.data = data;
        this.next = this; // Point to itself to form a circular structure
    }
}

// Class implementing circular linked list operations
class CircularLinkedList {
    CircularNode head; // Head of the list

    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        CircularNode newNode = new CircularNode(data); // Create a new node
        if (head == null) { // If the list is empty
            head = newNode; // Make new node the head
            return;
        }
        CircularNode current = head; // Start from head
        while (current.next != head) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Link last node to new node
        newNode.next = head; // Link new node back to head
    }

    // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return; // If list is empty
        if (head.data == value && head.next == head) { // If list has one node
            head = null; // Make list empty
            return;
        }
        CircularNode current = head; // Start from head
        CircularNode prev = null; // To track previous node
        do {
            if (current.data == value) { // If current node has the value
                if (prev != null) { // If node to delete is not head
                    prev.next = current.next; // Link previous to next
                } else { // If node to delete is head
                    CircularNode temp = head;
                    while (temp.next != head) { // Traverse to the last node
                        temp = temp.next;
                    }
                    temp.next = head.next; // Link last node to next node
                    head = head.next; // Move head to next node
                }
                return;
            }
            prev = current; // Update previous node
            current = current.next; // Move to next node
        } while (current != head); // Traverse till back to head
    }

    // Method to traverse and print the list
    public void traverse() {
        if (head == null) return; // If list is empty
        CircularNode current = head; // Start from head
        do {
            System.out.print(current.data + " -> "); // Print data
            current = current.next; // Move to next node
        } while (current != head); // Traverse until back to head
        System.out.println("(head)"); // End of circular list
    }
}
