package Arrays;

public class RotateArray {
	private static void rotateArray(int[][] arr) {
		int m =arr.length;
		int n=arr[0].length;
		
		for(int i=0;i<m;i++) {
			for(int j=i;j<n;j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int i=0;i<m;i++) {
			int li=0;
			int ri=n-1;
			while(li<ri) {
				int temp =arr[i][li];
				arr[i][li]=arr[i][ri];
				arr[i][ri]=temp;
				
				li++;
				ri--;
			}
		}
	}
	public static void main(String[] args) {
		int[][]arr = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		
		rotateArray(arr);
		
//		for(int[] mat:arr) {
//			System.out.println();
//		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
