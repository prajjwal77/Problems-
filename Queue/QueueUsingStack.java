package Queue;

import java.util.Stack;

public class QueueUsingStack {
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	
	//insertion of data  in queue....
	static void enqueue(int data) {
		stack1.push(data);
	}
	
	//deletion of the data from the queue - FIF0...
	static int dequeue() {
		int ele;
		if(stack1.empty() && stack2.empty()) {
			System.out.println("Queue is Empty...");
			System.exit(0);
		}
		//push all the element from stack1 to stack2 
		if(stack2.empty()) {
			while(!stack1.empty()) {
				ele = stack1.pop();
				stack2.push(ele);
			}
		}
		//pop the top element from stack2...
		ele = stack2.pop();
		return ele;
	}
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		//function calling for  insertion in the queue
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		//function calling for deletion
		System.out.println("Deletion of element is : "+ q.dequeue());
	}
}
