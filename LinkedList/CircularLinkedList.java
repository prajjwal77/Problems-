package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    // Insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  // Maintain circular link
        }
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head, prev = tail;

        // If head needs to be deleted
        if (head.data == key) {
            if (head == tail) { // Only one node
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Traverse to find the node
        do {
            if (current.data == key) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Node with value " + key + " not found.");
    }

    // Traverse and print the list
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Insert elements
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        System.out.print("Circular Linked List: ");
        cll.traverse();

        // Delete an element
        cll.delete(20);
        System.out.print("After deleting 20: ");
        cll.traverse();

        // Delete head
        cll.delete(10);
        System.out.print("After deleting 10 (head): ");
        cll.traverse();

        // Delete tail
        cll.delete(40);
        System.out.print("After deleting 40 (tail): ");
        cll.traverse();

        // Try to delete a non-existent node
        cll.delete(100);
    }
}
