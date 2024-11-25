package LinkedList;

class LLNode {
	int data;
	LLNode next;

	LLNode(int d) {
		data = d;
		next = null;
	}
}

public class OddEvenNode {
	public LLNode oddEven(LLNode head) {
		if (head == null) {
			return head;
		}
		LLNode oddHead = head;
		LLNode odd = head;

		LLNode evenHead = head.next;
		LLNode even = head.next;

		while (odd != null && odd.next != null && even != null && even.next != null) {
			odd.next = odd.next.next;
			odd = odd.next;

			even.next = even.next.next;
			even = even.next;
		}
		odd.next = evenHead;
		return oddHead;
	}

	public void traversal(LLNode llNode) {
		LLNode temp = llNode;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;

		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		LLNode llNode = new LLNode(4);
		llNode.next = new LLNode(1);
		llNode.next.next = new LLNode(2);
		llNode.next .next.next= new LLNode(3);
		llNode.next.next.next.next = new LLNode(11);
		
		
		OddEvenNode oddEvenNode = new OddEvenNode();
		System.out.println("Before OddEven operation :");
		oddEvenNode.traversal(llNode);
		System.out.println();
		System.out.println("After OddEven operation : ");
		
		oddEvenNode.traversal(oddEvenNode.oddEven(llNode));
	}
}
