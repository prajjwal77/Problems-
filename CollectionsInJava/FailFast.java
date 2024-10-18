package CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add(90);
		aList.add(70);
		aList.add(50);
		aList.add(40);
		
		//loop run for infinite time
//		for(int i=0;i<aList.size();i++) {
//			System.out.println(aList.get(i));
//			aList.add(100);
//		}
		//fail - fast
		Iterator itr = aList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			aList.add(100);
		}
	}
}
