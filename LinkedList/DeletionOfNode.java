package LinkedList;

import javax.xml.transform.Templates;

public class DeletionOfNode {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
		public void deletionOfNode(int pos) {
			if(head ==null) {
				return;
			}
			
			Node temp = head;
			if(pos == 0) {
				head = temp.next;
				return;
			}
			
			for(int i=0 ; temp!=null && i < pos - 1 ; i++) {
				temp = temp.next;
			}
			
			if(temp == null && temp.next ==null) {
				return;
			}
			
			temp.next = temp.next.next;
		}
		//insert at beginning
		public void insert(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head = newNode;
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
			DeletionOfNode dL = new DeletionOfNode();
			dL.insert(2);
			dL.insert(4);
			dL.insert(6);
			dL.insert(8);
			dL.insert(10);
			
			dL.traversal();
			dL.deletionOfNode(1);
			System.out.println();
			dL.traversal();
		}
}
