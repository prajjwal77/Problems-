package BackTracking;

import java.util.Scanner;

public class TilingProblems {

	public static int getWays(int n) {
		if(n<=3) {
			return n;
		}
		return getWays(n-1)+getWays(n-2);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of tiles : ");
		int n=scanner.nextInt();
		int ways =getWays(n);
		System.out.println(ways + " ways");
	}
}
