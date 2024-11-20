package LinkedList;

import LinkedList.InsertionAtBegining.Node;

public class InsertAtAnyPos {
	Node head;
	
		class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
		public void InsertionAtBegining(int newData) {
			Node newNode = new Node(newData);
			
			//LinkedList is empty
			if(head == null) {
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head = newNode;
		}
	 public  void insertAtAnyPos(int data,int index) {
		 
		 
		 Node  newNode = new Node(data);
		 Node currNode = head;
		 //Node tempNode =head.next;
		 int currentIndex = 0;
		 while(currNode!=null && currentIndex<index-1) {
			 currNode = currNode.next;
			 currentIndex++;
		 }
		  newNode.next = currNode.next;
		  currNode.next = newNode;
	 }
	 
	 public void displayLL() {
		 Node tempNode = head;
		 while(tempNode != null) {
			 System.out.print(tempNode.data +" -> ");
			 tempNode = tempNode.next;
		 }
		 System.out.print("null");
	 }
	 public static void main(String[] args) {
		InsertAtAnyPos lListAnyPos =new InsertAtAnyPos();
		lListAnyPos.InsertionAtBegining(10);
		lListAnyPos.InsertionAtBegining(20);
		lListAnyPos.InsertionAtBegining(30);
		lListAnyPos.InsertionAtBegining(40);
		
		lListAnyPos.displayLL();
		System.out.println();
		System.out.println("After inertion of 25 at 3");
		lListAnyPos.insertAtAnyPos(25, 2);
		lListAnyPos.displayLL();
	}
}
