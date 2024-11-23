package LinkedList;

import java.util.ArrayList;
import java.util.List;



public class PalindromeLL {

	Node head;
	class Node {
		int data ;
		Node next;
		Node(int d){
			data=d;
			next =null;
		}
	}
	public boolean  checkPalindrome() {
		List<Integer>list = new ArrayList<>();
		Node currNode = head;
		while(currNode!=null) {
			list.add(currNode.data);
			currNode=currNode.next;
		}
		
		int  low=0;
		int  high=list.size()-1;
		while(low<high) {
			if(!list.get(low).equals(list.get(high))) {
				return false;
			}
			low =low+1;
			high=high-1;
		}
		return true;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next =head;
		head= newNode;
	}
	public void traversal() {
		Node currNode =head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		PalindromeLL pLl=new PalindromeLL();
		pLl.insert(1);
		pLl.insert(2);
		pLl.insert(3);
		pLl.insert(3);
		pLl.insert(7);
		pLl.insert(1);
		pLl.traversal();
		boolean check = pLl.checkPalindrome();
		System.out.println("is Palindrome : "+check);
	}
}
