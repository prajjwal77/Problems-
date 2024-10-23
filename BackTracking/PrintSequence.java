package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintSequence {
	public static  void sequence(int[] arr, int index, ArrayList<Integer> temp) {
		//base case
		if(index==arr.length) {
			//print sequence but do not print empty entries
			if(temp.size()>0) {
				System.out.println(temp);
			}
			return;
		}
		//recursive call
		//include 
		sequence(arr, index+1, temp);
		
		//add the value in temp
		temp.add(arr[index]);
		
		//do not include value
		sequence(arr, index+1, temp);
		
		//remove the value
		temp.remove(temp.size()-1);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println("For the array - "+Arrays.toString(arr));
		sequence(arr, 0, new ArrayList<>());
	}
}
