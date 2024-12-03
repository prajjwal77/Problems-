package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MoreAboutDeque {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(5);
		deque.addFirst(7);
		deque.addLast(9);
		deque.add(10);
		System.out.println("Deque output looks like : "+ deque);
		deque.removeFirst();
		System.out.println("After Ist deletions : "+deque);
		
		deque.removeLast();
		System.out.println("After last deletions : "+deque);
	}
}
