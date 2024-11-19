package LinkedList;

public class InsertionAtEnd {
	Node head;
	 class Node{
		 int  data;
		 Node next;
		 
		 Node(int d){
			 data = d;
			 next = null;
		 }
	 }
	 //implementation of insertion of a node at end
	 public void insertAtEnd(int newData) {
		 Node newNode = new Node(newData);
		 
		 //linkedList is empty
		 if(head == null) {
			 head = new Node(newData);
			 return;
		 }
		 
		 //if  LinkedList is not empty
		 newNode.next=null;
		 Node temp = head;
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 
		 temp.next=newNode;
		 return;
	 }
	 //implementation of displaying the linkedlist
	 public void displayLL() {
		 Node tempNode = head;
		 while(tempNode != null) {
			 System.out.print(tempNode.data+" -> " );
			 tempNode=tempNode.next;
		 }
		 System.out.print("null");
	 }
	 public static void main(String[] args) {
		 InsertionAtEnd llist = new InsertionAtEnd();
		 
		 llist.insertAtEnd(2);
		 llist.insertAtEnd(4);
		 llist.insertAtEnd(6);
		 llist.insertAtEnd(8);
		 
		 llist.displayLL();
	}
}
