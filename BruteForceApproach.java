import java.util.Scanner;
import java.io.*;
import java.util.*;



public class BruteForceApproach {
    public static   void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int m = scan.nextInt();
        System.out.println("Enter no of column : ");
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int r1, c1, r2, c2;
        System.out.println("Enter the value of r1 coordinate :");
        r1 = scan.nextInt();
        System.out.println("Enter the value of c1 coordinate : ");
        c1 = scan.nextInt();
        System.out.println("Enter the value of r2 coordinate : ");
        r2 = scan.nextInt();
        System.out.println("Enter the value of c2 coordinate : ");
        c2 = scan.nextInt();
        int result = findSumMatrix(arr, r1, c1, r2, c2);
        System.out.println("Sum of element of given rectangle : " + result);
    }

     public static  int findSumMatrix(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum+= arr[i][j];
            }
        }
        return sum;
    }

}
