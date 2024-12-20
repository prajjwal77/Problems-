package LeetCode;

public class MinMax {
	static class Pair{
		int min;
		int  max;
	}
	public static Pair getMinMax(int[] arr, int i,int j) {
		Pair minmax = new Pair();
		Pair minmaxLeft = new Pair();
		Pair minmaxRight = new Pair();
		
		//1. Small Problem
		//if number of element is equal to 1
		if(i == j) {
			minmax.min = arr[i];
			minmax.max = arr[i];
			return minmax;
		}
		//if number of element is equal to 2
		else if(i == j-1) {
			if(arr[i] < arr[j]) {
				minmax.min = arr[i];
				minmax.max = arr[j];
			}
			else {
				minmax.min = arr[j];
				minmax.max = arr[j];
			}
			return minmax;
		}
		
		//2. Big Problem  - Divide and Conquer  Approach
		else {
			//1. Divide
			int mid = i+(j-i)/2;
			//2.conquer
			minmaxLeft =getMinMax(arr, i, mid);
			minmaxRight = getMinMax(arr, mid+1, j);
			
			//3.combine
			//compared the minimum values of left and right
			if(minmaxLeft.min < minmaxRight.min) {
				minmax.min = minmaxLeft.min;
			}
			else {
				minmax.min = minmaxRight.min;
			}
			//compare the maximum value of left and right
			if(minmaxLeft.max < minmaxRight.max) {
				minmax.max = minmaxRight.max;
			}
			else {
				minmax.max = minmaxLeft.max;
			}
			return minmax;
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {50,45,11,9,15,75,89,97};
		int n = arr.length;
		
		Pair minmax = getMinMax(arr,0,n-1);
		System.out.println("The Smallest element in an array is : "+minmax.min);
		System.out.println("The Largest element in an array is : "+minmax.max);
	}
}
