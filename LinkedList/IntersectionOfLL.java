package LinkedList;
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class IntersectionOfLL {

	 public int length(ListNode head) {
		 ListNode tempListNode  = head;
		 int  count =0;
		 
		 while(tempListNode!=null) {
			 tempListNode= tempListNode.next;
			 count++;
			 
		 }
		 return count;
	 }
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 int lA = length(headA);
		 int lB = length(headB);
		 
		 while(lA>lB) {
			 headA = headA.next;
			 lA--;
		 }
		 
		 while(lA<lB){
			 headB = headB.next;
			 lB--;
		 }
		 
		 while(headA!=null && headB!=null) {
			 if(headA == headB) {
				 return headA;
			 }
			 headA = headA.next;
			 headB = headB.next;
		 }
		 return null;
	 }
	 public static void main(String[] args) {
		 ListNode intersect = new ListNode(8);
		 intersect.next = new ListNode(4);
		 intersect.next.next = new ListNode(5);
		 
		 ListNode listA = new ListNode(4);
		 listA.next = new ListNode(1);
		 listA.next.next = intersect;

		 ListNode listB = new ListNode(5);
		 listB.next = new ListNode(6);
		 listB.next.next = new ListNode(1);
		 listB.next.next.next = intersect;
		 
		 IntersectionOfLL solution = new IntersectionOfLL();
		 ListNode result = solution.getIntersectionNode(listA, listB);
		 System.out.println(result != null ? "Intersected at '" + result.val + "'" : "No Intersection");
	}
}
