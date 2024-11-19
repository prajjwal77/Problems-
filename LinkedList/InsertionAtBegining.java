package LinkedList;

import javax.xml.transform.Source;

public class InsertionAtBegining {
	Node head;
	 class Node{
		 int  data;
		 Node next;
		 
		 Node(int d){
			 data = d;
			 next = null;
		 }
	 }
	 //insertion method
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
	 //traversal method
	 public void displayLL() {
		 Node tempNode = head;
		 while(tempNode != null) {
			 System.out.print(tempNode.data +" -> ");
			 tempNode = tempNode.next;
		 }
		 System.out.print("null");
	 }
	 public static void main(String[] args) {
		InsertionAtBegining lListAtBegining = new InsertionAtBegining();
		
		lListAtBegining.InsertionAtBegining(8);
		lListAtBegining.InsertionAtBegining(6);
		lListAtBegining.InsertionAtBegining(4);
		lListAtBegining.InsertionAtBegining(2);
		lListAtBegining.InsertionAtBegining(1);
		
		lListAtBegining.displayLL();
	}
}
