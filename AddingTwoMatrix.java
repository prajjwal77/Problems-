import java.util.Scanner;

public class AddingTwoMatrix {
    public static void main(String[] args) {
        System.out.print("Enter The Size Of Row : \n");
        Scanner scan=new Scanner(System.in);
        double row=scan.nextDouble();
        System.out.print("Enter The Size Of Column : \n");
        double col=scan.nextDouble();
        double [][] array1=new double[10][10];
        double [][] array2=new double[10][10];
        System.out.println("Enter first matrix :");
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                array1[i][j]=scan.nextDouble();
            }
        }

        System.out.println("Enter second Matrix :");
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                array2[i][j]=scan.nextDouble();
            }
        }
        System.out.println("Your First Matrix is :");
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Your Second Array is : ");
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        double [][] sum=new double[10][10];
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
               sum[i][j]=array1[i][j]+array2[i][j];
            }
        }  for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();

        }
    }
}
