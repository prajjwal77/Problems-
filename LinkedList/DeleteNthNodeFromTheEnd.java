package LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
	 
}
public class DeleteNthNodeFromTheEnd {
	
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
	public ListNode removeNode(ListNode head, int n) {
		ListNode temp =  head;
		int length=0;
		while(temp.next!=null) {
			length++;
			temp=temp.next;
		}
		int sub = length-n;
		ListNode slow = head;
		for(int i=1;i<=sub;i++) {
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return head;
	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode fast = head, slow = head;
	        for (int i = 0; i < n; i++) { 
	        	fast = fast.next;
	        }
	        
	       
	        
	        while (fast.next != null) {
	            fast = fast.next;
	            slow = slow.next;
	        }
	        slow.next = slow.next.next;
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
		
			DeleteNthNodeFromTheEnd obj = new DeleteNthNodeFromTheEnd();
	        // Create list: 10 -> 20 -> 30 -> 40 -> 50
	        ListNode head = new ListNode(10);
	        head.next = new ListNode(10);
	        head.next.next = new ListNode(30);
	        head.next.next.next = new ListNode(40);
	        head.next.next.next.next = new ListNode(40);
	        head.next.next.next.next.next = new ListNode(60);

	        System.out.print("Before: ");
	        obj.printList(head);

	       // head = obj.removeNthFromEnd(head, 2); // Delete 2nd node from end (40)
	        head = obj.removeNode(head, 3);
	        System.out.print("After: ");
	        obj.printList(head);
	       
	}
}
