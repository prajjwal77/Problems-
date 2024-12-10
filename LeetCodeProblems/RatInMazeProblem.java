package LeetCode;

import java.util.ArrayList;

public class RatInMazeProblem {
	public static void solveMaze(ArrayList<String>ans,int r,int c, int[][]arr,int n,String p ,boolean[][]vis) {
		 // Base case: reached the destination
        if (r == n - 1 && c == n - 1 && arr[r][c] == 1) {
            ans.add(p);
            return;
        }
     // Check if the current position is valid
        if (r >= 0 && r < n && c >= 0 && c < n && !vis[r][c] && arr[r][c] == 1) {
            vis[r][c] = true;

            // Move down
            solveMaze(ans, r + 1, c, arr, n, p + "D", vis);
            // Move up
            solveMaze(ans, r - 1, c, arr, n, p + "U", vis);
            // Move left
            solveMaze(ans, r, c - 1, arr, n, p + "L", vis);
            // Move right
            solveMaze(ans, r, c + 1, arr, n, p + "R", vis);

            // Backtrack
            vis[r][c] = false;
		}
		
	}
	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 0, 0 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
		int n = arr.length;
		ArrayList<String> ans = new ArrayList<>();
		boolean[][] vis = new boolean[n][n];
		
		solveMaze(ans,0,0,arr,n,"",vis);
		
		System.out.println(ans);
	}
}
