package HashMapProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the ransomenote string : ");
		String r = scanner.nextLine();
		System.out.println("ENter the magazine string :");
		String m = scanner.nextLine();
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(int i=0;i<r.length();i++) {
			char c = r.charAt(i);
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}
			else {
				map1.put(c, 1);
			}
		}
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(int i=0;i<m.length();i++) {
			char c = m.charAt(i);
			if(map2.containsKey(c)) {
				map2.put(c, map2.get(c)+1);
			}
			else {
				map2.put(c, 1);
			}
		}
		boolean ans = true;
		for(Map.Entry<Character,Integer> e:map1.entrySet()) {
			if(!map2.containsKey(e.getKey())|| e.getValue()>map2.get(e.getKey())) {
				ans = false;
				break;
			}
		}
		System.out.println(ans);
	}
}
