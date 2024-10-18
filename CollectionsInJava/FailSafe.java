package CollectionInJava;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
	CopyOnWriteArrayList aList = new CopyOnWriteArrayList();
	aList.add(90);
	aList.add(70);
	aList.add(50);
	aList.add(40);
	
	//Fail-Safe
	Iterator itr = aList.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		aList.add(100);//handling exception but fail for concurrent modification
	}
	
	}
}
