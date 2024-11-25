package LinkedList;

class Node{
    int val;
     Node next;
     Node(int x) {
         val = x;
         next = null;
     }
 }
public class DeleteNodeWithoutHead {
   public void traversal(Node head) {
	   Node temp = head;
	   while(temp!=null) {
		   System.out.print(temp.val+ " ->");
		   temp = temp.next;
		   
	   }
	   System.out.print("null");
	   }
   public void deletNode(Node node) {
	   if (node == null || node.next == null) {
           throw new IllegalArgumentException("Node to be deleted cannot be null or the last node.");
       }
	   int temp =node.val;
	   node.val = node.next.val;
	   node.next = node.next.next;
   }
   public static void main(String[] args) {
	Node listNode = new Node(4);
	listNode.next = new Node(1);
	listNode.next.next = new Node(5);
	listNode.next.next.next = new Node(9);
	
	DeleteNodeWithoutHead deleteNodeWithoutHead = new DeleteNodeWithoutHead();
	System.out.println("before deletion of node:");
	deleteNodeWithoutHead.traversal(listNode);
	
	System.out.println("After deletion of node :");
	deleteNodeWithoutHead.deletNode(listNode.next.next);
	deleteNodeWithoutHead.traversal(listNode);
}
}
