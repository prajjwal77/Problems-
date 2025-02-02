package Pattern;

import java.util.Scanner;

public class PatternGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an odd number (n ≥ 3): ");
		int n = scanner.nextInt();

		// Validate input
		if (n < 3 || n % 2 == 0) {
			System.out.println("Invalid input!");
			return;
		}

		printPattern(n);
		scanner.close();
	}

	public static void printPattern(int n) {
		n = n * 2 + 3;
		
		//logic for n=3
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= 2 && j <= 6 && i == 2 || i == 1 && j >= 3 && j <= 5 || i == 0 && j == 4
						|| j == 0 && i >= 6 && i <= 8 || j == 1 && i == 7 || j == 7 && i == 7
						|| j == 8 && i >= 6 && i <= 8) {
					System.out.print("*");
				}
				// Conditions to print 'e'
				else if (j == 2 && i >= 3 && i <= 7 || j == 6 && i >= 3 && i <= 7) {
					System.out.print("e");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
