import java.security.spec.RSAOtherPrimeInfo;

public class SudokuGame {
    public static void print (int [][]grid,int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int [][] grid ,int row,int col,int num,int n) {
        //row clash -row has unique value
        for (int i = 0; i < n; i++) {
            //check if it is safe to assign the number or not
            if (grid[row][i] == num) {
                return false;
            }
        }
        //column  clash - column has unique column
        for(int i=0;i<n;i++){
            //check if it is safe to assign the number or not
            if(grid[i][col]==num) {
                return false;
            }
        }
        //subgrid / box clash -subgrid has unique value
        int sqrt =(int)Math.sqrt(n);
        int boxRow=row-row%sqrt;
        int boxColumn=col-col%sqrt;
        for(int i=boxRow;i<boxRow+sqrt;i++){
            for(int j=boxColumn;j<boxColumn+sqrt;j++){
                if(grid[i][j]==num){
                    return false;
                }
            }
        }
        return true;//if there is no clash
    }
    public static boolean sudokuSolve(int [][]grid ,int n){
        int row=-1,column=-1;
        boolean isEmpty=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    row=i;
                    column=j;
                    //we have some solve left in sudoku
                    isEmpty=false;
                    break;
                }
            }
            if(!isEmpty){
                break;
            }
        }
        //no Empty space left
        if(isEmpty){
            return true;
        }
        //else for each row  backtrack

        for(int num=1;num<=9;num++){
            if(isSafe(grid,row,column,num,n)==true){
                return true;
            }
            else{
                grid[row][column]=0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] grid={{3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {1,0,0,0,5,0,8,6,0},
                {1,2,5,0,0,8,0,8,7},
                {3,4,5,8,9,0,0,0,0},
                {4,6,5,4,3,0,0,9,0},
                {1,2,0,0,0,0,6,5,8},
                {6,0,0,9,8,0,7,5,0}};
        if(sudokuSolve(grid, grid.length)){
            print(grid, grid.length);
        }
        else{
            System.out.println("No Solution exists;");
        }
    }
}
