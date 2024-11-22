package LinkedList;

import LinkedList.DeletionOfNode.Node;

public class MiddleNode {

	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
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

		//middle node 
		public void middleNode() {
			Node currNode = head;
			Node nextNode = head;
			while(nextNode!=null && nextNode.next!=null) {
				currNode=currNode.next;
				nextNode = nextNode.next.next;
			}
			System.out.println("The Middle node is : "+currNode.data);
		}
		////insertion at ending
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
		public static void main(String[] args) {
			MiddleNode middleNode = new MiddleNode();
			middleNode.insert(2);
			middleNode.insert(4);
			middleNode.insert(5);
			middleNode.insert(1);
			middleNode.insert(10);
			middleNode.insert(17);
			middleNode.insert(11);
			middleNode.traversal();
			System.out.println();
			middleNode.middleNode();
		}
}
