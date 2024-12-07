package HashMapProblems;

import java.util.Scanner;
import java.util.TreeMap;
//TC = O(nlogn)
//Sc = O(n)
public class Assignment1 {
public static void main(String[] args) {
	//Step -1
	//Input the no. of key value pairs
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of key-value pairs :");
	int n = scanner.nextInt();
	//Step -2
	//Create A Treemap 
	TreeMap<Integer, String> map = new TreeMap<>();
	//Step -3
	//Insert the key value pairs and insert them in the Treemap
	System.out.println("Insert the key values pairs : ");
	for(int i=0;i<n;i++) {
		int key = scanner.nextInt();
		String value = scanner.nextLine();
		map.put(key, value);
	}
	//Step -4
	//print the map
	System.out.println("The map is : "+map);
}
}
