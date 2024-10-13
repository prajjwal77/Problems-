package Arrays;

import java.util.Scanner;

public class PrefixSum {
	public static void prefixSumMatrix(int[][] arr) {
		int m=arr.length;
		int n=arr[0].length;
		//traversed the array row-wised to calculate the row-wise prefix sum
		for(int i=0;i<m;i++) {
			for(int j=1;j<n;j++) {
				arr[i][j]+=arr[i][j-1];
			}
		}
		//traversed the array col-wised to calculate the col-wise prefix sum
		for(int j=0;j<n;j++) {
			for(int i=1;i<m;i++) {
				arr[i][j]+=arr[i-1][j];
			}
		}
	}
	public static int sumRegion(int[][] arr,int r1,int c1,int r2,int c2) {
		int sum=0,up=0,left=0,repeated_region=0;
		int result=0;
		
		sum=arr[r2][c2];
		up =arr[r1-1][c2];
		left = arr[r2][c1-1];
		repeated_region=arr[r1-1][c1-1];
		result =sum-up-left+repeated_region;
		return result;
	}
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
		prefixSumMatrix(arr);
		int result=sumRegion(arr,r1,c1,r2,c2);
		
		System.out.println("Sum of element of given rectangle is : "+result);
	}
}
