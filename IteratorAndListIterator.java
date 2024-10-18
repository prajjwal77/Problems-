package CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {
	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add(90);
		aList.add(70);
		aList.add(50);
		aList.add(40);
		
		System.out.println(aList);
		System.out.println("Using Iterator..........");
		//Iterator
		Iterator itr = aList.iterator();
		while(itr.hasNext()) {
			//Integer integer  = (Integer)itr.next();
		System.out.println(itr.next());
	}
		System.out.println("Using ListIterator.........");
		//ListIterator
		ListIterator lItr = aList.listIterator(aList.size());
		while(lItr.hasPrevious()) {
			System.out.println(lItr.previous());
		}
	}
}
