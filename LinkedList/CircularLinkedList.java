package LinkedList;

public class CircularLinkedList {

    // Static nested Node class
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Insert a node at a specific position
    static Node insertAtPosition(Node last, int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return last;
        }

        Node newNode = new Node(data);

        // Case 1: Empty list
        if (last == null) {
            if (pos != 1) {
                System.out.println("Invalid position!");
                return last;
            }
            newNode.next = newNode;
            return newNode;
        }

        // Case 2: Insert at beginning
        Node head = last.next;
        if (pos == 1) {
            newNode.next = head;
            last.next = newNode;
            return last;
        }

        // Case 3: Insert at given position
        Node curr = head;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
            if (curr == head) {
                System.out.println("Invalid position!");
                return last;
            }
        }

        newNode.next = curr.next;
        curr.next = newNode;

        // Update last if inserted at the end
        if (curr == last) {
            last = newNode;
        }

        return last;
    }

    // Delete a node by value
    static Node deleteNode(Node last, int key) {
        if (last == null) {
            System.out.println("List is empty.");
            return null;
        }

        Node head = last.next;

        // If only one node
        if (head == last && head.data == key) {
            return null;
        }

        // Deleting the head node
        if (head.data == key) {
            last.next = head.next;
            return last;
        }

        // Deleting other node
        Node curr = head;
        while (curr.next != last.next) {
            if (curr.next.data == key) {
                curr.next = curr.next.next;

                // Update last if last node is deleted
                if (last.data == key) {
                    last = curr;
                }

                return last;
            }
            curr = curr.next;
        }

        System.out.println("Value " + key + " not found.");
        return last;
    }

    // Print the circular linked list
    static void printList(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node head = last.next;
        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Node last = null;

        // Create initial list: 2 → 3 → 4 (circular)
        last = insertAtPosition(last, 2, 1);
        last = insertAtPosition(last, 3, 2);
        last = insertAtPosition(last, 4, 3);

        System.out.print("Original list: ");
        printList(last);

        // Insert 5 at position 2
        last = insertAtPosition(last, 5, 2);
        System.out.print("After inserting 5 at position 2: ");
        printList(last);

        // Delete node with value 3
        last = deleteNode(last, 3);
        System.out.print("After deleting 3: ");
        printList(last);

        // Delete head (2)
        last = deleteNode(last, 2);
        System.out.print("After deleting head (2): ");
        printList(last);

        // Delete last node (4)
        last = deleteNode(last, 4);
        System.out.print("After deleting last (4): ");
        printList(last);
    }
}
