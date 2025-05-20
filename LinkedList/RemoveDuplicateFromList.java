package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}	
public class RemoveDuplicateFromList {
	public ListNode removeDuplicate(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(slow.next != null) {
			if(slow.val == fast.val) {
				slow.next = slow.next.next;
				fast = fast.next;
			}
			else {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return head;
	}

	//method to print list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		RemoveDuplicateFromList obj = new RemoveDuplicateFromList();
		 	
		 // Create list: 10 -> 10 -> 30 -> 40 -> 40 -> 60
        ListNode head = new ListNode(10);
        head.next = new ListNode(10);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(40);
        head.next.next.next.next.next = new ListNode(60);
        System.out.println("Before Removing Duplicate :");
        obj.printList(head);
        System.out.println("After : ");
        obj.removeDuplicate(head);
        obj.printList(head);
	}

}
