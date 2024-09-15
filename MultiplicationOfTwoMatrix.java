import java.util.Scanner;

public class MultiplicationOfTwoMatrix {
    public static void main(String[] args) {
        System.out.print("Enter The Size Of Row : ");
        Scanner scan=new Scanner(System.in);
        int row= scan.nextInt();
        System.out.println();
        System.out.print("Enter The Size Of Column : ");
        int col=scan.nextInt();
        System.out.println();
        int [][] matrix1=new int[10][10];
        int [][] matrix2=new int[10][10];
        int [][] multi=new int [10][10];
        System.out.println("Enter matrix1 element :");
        for( int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                matrix1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter matrix2 element : ");
        for( int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                matrix2[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix1 :");
        for( int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix2 : ");
        for( int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }for( int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                multi[i][j]=0;
                for(int k=1;k<=col;k++){
                    multi[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("Multiplication Of Matrices is : ");
        for( int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }

    }
}
