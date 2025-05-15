package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeLinkedLists {

    // Function to merge two sorted linked lists
    public ListNode merge(ListNode l1, ListNode l2) {
        // Create a dummy node as the head of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists and merge in ascending order
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append remaining nodes of l1 or l2 (if any)
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        // Return the merged list (starting from dummy.next to skip the dummy node)
        return dummy.next;
    }

    // Helper function to print a linked list (for testing)
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        MergeLinkedLists merger = new MergeLinkedLists();

        // Example linked lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Merge lists
        ListNode merged = merger.merge(l1, l2);

        // Print merged list
        System.out.print("Merged list: ");
        merger.printList(merged);
    }
}
