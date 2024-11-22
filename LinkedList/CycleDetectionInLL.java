package LinkedList;

import LinkedList.DeletionOfNode.Node;

public class CycleDetectionInLL {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// insert at beginning
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	// traversal
	public void traversal() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	//Floyd's Cycle detection Algorithm
	public void deteectLoop() {
		Node slow = head , fast = head;
		boolean bool =false;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				bool=true;
				break;
			}
		}
		if(bool == false) {
			System.out.println("No Loop Detected.");
		}
		else {
			System.out.println("Loop Is Detected.");
		}
	}
	public static void main(String[] args) {
		CycleDetectionInLL cycleDetectionInLL = new CycleDetectionInLL();
		cycleDetectionInLL.insert(9);
		cycleDetectionInLL.insert(8);
		cycleDetectionInLL.insert(7);
		cycleDetectionInLL.insert(6);
		cycleDetectionInLL.insert(5);
		cycleDetectionInLL.insert(4);
		
		cycleDetectionInLL.traversal();
		System.out.println();
		Node tempNode = cycleDetectionInLL.head;
		while(tempNode.next!=null) {
			tempNode=tempNode.next;
		}
		tempNode.next = cycleDetectionInLL.head;
		cycleDetectionInLL.deteectLoop();
	}
}
