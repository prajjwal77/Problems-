package BackTracking;

public class SubsetPermutation {

	public static String swap(String str, int i,int j) {
		char[] charArray =str.toCharArray();
		
		char temp = charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		
		return String.valueOf(charArray);
	}
	public static void permutation(String str,int l,int r) {
		//base case
		if(l==r) {
			System.out.println(str);
		}
		else {
			//recursive call
			for(int i=l;i<=r;i++) {
				str = swap(str, l, r);
				permutation(str, l+1, r);
				//backtracking
				swap(str, l, r);
			}
		}
	}
	public static void main(String[] args) {
		String string =  "XYZ";
		int length =string.length();
		System.out.println("For string : "+string+" permutation are :");
		permutation(string, 0, length-1);
	}
	
}
