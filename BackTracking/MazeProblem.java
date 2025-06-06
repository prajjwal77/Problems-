package BackTracking;

public class MazeProblem {

	public static void printSolution(int[][] output,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean isSafe(int[][] maze,int i,int j,int n) {
	
		if(i>=0 && i<n && j>=0 && j<n && maze[i][j]==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean solveMaze(int[][] maze, int[][] output , int i,int j,int n) {
		if(i==n-1 && j==n-1 && maze[i][j]==1) {
			output[i][j]=1;
			return true;
		}
		if(isSafe(maze, i, j, n)==true) {
			if(output[i][j]==1) {
				return false;
			}
			
			output[i][j]=1;
			
			if(solveMaze(maze,output, i+1, j, n)==true) {
				return true;
			}
			if(solveMaze(maze,output, i, j+1, n)==true) {
				return false;
			}
			
			
			output[i][j]=0;
			return false;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] maze = {{1,0,1,0},
						{1,0,1,1},
						{1,1,0,0},
						{0,1,1,1}};
		
		int n = maze.length;
		
		if(solveMaze(maze, maze, 0, 0, 0)==true) {
			printSolution(maze, n);
		}
		else {
			System.out.println("Solution doesn't exist");
		}
	}
}
