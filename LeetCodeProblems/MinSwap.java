package LeetCode;

public class MinSwap {
	public static int swapCount(String str) {
		char[] chars = str.toCharArray();
		int countL =0, countR =0,swap =0, imbalanced =0;
		for(int i =0;i<chars.length;i++) {
			if(chars[i] == '[') {
				countL++;
				if(imbalanced>0) {
					swap += imbalanced;
					imbalanced--; 
				}
			}
			else if(chars[i]==']') {
				countR++;
				imbalanced =(countR - countL);
			}
		}
		return swap;
	}
	public static void main(String[] args) {
		String str = "[]][][";
		System.out.println(swapCount(str));
	}
}
