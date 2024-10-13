package Arrays;

import java.util.Scanner;

public class PrefixSumBruteForceApproach {
	//TC = 0(m*n)
	//SC = 0(1)
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int r=scanner.nextInt();
		System.out.println("Enter the no of column : ");
		int c=scanner.nextInt();
		int[][] arr=new int[r][c];
		System.out.print("Enter the martix element :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}	
		int r1,r2,c1,c2;
		System.out.println("Enter the value or r1 : ");
		r1=scanner.nextInt();
		
		System.out.println("Enter the value of c1 : ");
		c1=scanner.nextInt();
		
		System.out.println("Enter the value of r2 : ");
		r2=scanner.nextInt();
		
		System.out.println("Enter the value of c2 : ");
		c2=scanner.nextInt();
		
		int result=findSummatrix(arr,r1,c1,r2,c2);
		
		System.out.println("Sum of element of given rectangle is : "+result);
	}
	
	private static int findSummatrix(int[][] arr, int r1,int c1,int r2, int c2) {
		int sum=0;
		for(int i=r1;i<=r2;i++) {
			for(int j=c1;j<=c2;j++) {
				sum=sum+arr[i][j];
			}
		}
		return sum;
	}
}
