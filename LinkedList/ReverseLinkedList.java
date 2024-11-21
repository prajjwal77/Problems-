package LinkedList;

import LinkedList.DeletionOfNode.Node;

public class ReverseLinkedList {

	Node head ;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void reversal() {
		if(head==null) {
			return;
		}
		Node curr = head;
		Node prevNode = null;
		Node nextNode =null;
		while(curr!=null) {
			nextNode = curr.next;
			curr.next = prevNode;
			prevNode = curr;
			curr = nextNode;
		}
		head =prevNode;
	}
	
	//insert at beginning
			public void insert(int data) {
				Node newNode = new Node(data);
				if(head==null) {
					head = newNode;
					return;
				}
				newNode.next =null;
				Node temNode= head;
				while(temNode.next!=null) {
					temNode=temNode.next;
				}
				temNode.next =newNode;
				return;
			}
			
	//traversal
	public void traversal() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		 System.out.print("null");
	}

	public static void main(String[] args) {
		ReverseLinkedList rL = new ReverseLinkedList();
		rL.insert(2);
		rL.insert(4);
		rL.insert(6);
		rL.insert(8);
		rL.insert(10);
		
		System.out.println("Befor Reversing the List :");
		rL.traversal();
		System.out.println();
		System.out.println("After Reversing the list :");
		rL.reversal();
		rL.traversal();
	}
}
