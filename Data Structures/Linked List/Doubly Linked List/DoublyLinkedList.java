// Class representing a node in a doubly linked list
class DoublyNode {
    int data; // Data held by the node
    DoublyNode next; // Pointer to the next node
    DoublyNode prev; // Pointer to the previous node

    // Constructor to initialize node data and set pointers to null
    DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Class implementing doubly linked list operations
class DoublyLinkedList {
    DoublyNode head; // Head of the list

    // Method to insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        DoublyNode newNode = new DoublyNode(data); // Create a new node
        newNode.next = head; // Link new node to current head
        if (head != null) { // If list is not empty
            head.prev = newNode; // Link head's previous to new node
        }
        head = newNode; // Make new node the head
    }

    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data); // Create a new node
        if (head == null) { // If list is empty
            head = newNode; // Make new node the head
            return;
        }
        DoublyNode current = head; // Start from head
        while (current.next != null) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Link last node to new node
        newNode.prev = current; // Link new node's previous to last node
    }

    // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return; // If the list is empty
        DoublyNode current = head; // Start from head
        while (current != null && current.data != value) {
            current = current.next; // Move to the next node
        }
        if (current == null) return; // If value not found
        if (current.prev != null) current.prev.next = current.next; // Link previous to next
        if (current.next != null) current.next.prev = current.prev; // Link next to previous
        if (current == head) head = current.next; // If node to be deleted is head
    }

    // Method to traverse the list in forward direction
    public void traverseForward() {
        DoublyNode current = head; // Start from head
        while (current != null) { // Traverse until the end of the list
            System.out.print(current.data + " <-> "); // Print data
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }

    // Method to traverse the list in reverse direction
    public void traverseBackward() {
        DoublyNode current = head; // Start from head
        while (current.next != null) { // Go to the last node
            current = current.next;
        }
        while (current != null) { // Traverse backward until the head
            System.out.print(current.data + " <-> "); // Print data
            current = current.prev; // Move to the previous node
        }
        System.out.println("null"); // End of the list
    }
}
