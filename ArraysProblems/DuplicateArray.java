package Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		int []arr= {1,2,3,3,5,7,5};
		int n =arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					System.out.println("Duplicate elements are : "+arr[i]);
			}
		}
	}
}
