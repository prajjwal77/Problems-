import java.util.Arrays;

public class RotationMatrix {
    public static void rotateMatrx(int[][] arr){
            int m=arr.length;
            int n=arr[0].length;
            for(int i=0;i<m;i++){
                for(int j=1;j<n;j++){
                    //transpose of matrix
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            //rotate matrix at 90 degree
            for(int i=0;i<m;i++){
                int li=0;     //left index
                int ri=n-1;   //right index
                while(li<ri){
                    int temp=arr[i][li];
                    arr[i][li]=arr[i][ri];
                    arr[i][ri]=temp;
                    li++;
                    ri--;
                }
            }
    }

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotateMatrx(arr);
//        for(int i=0;i<arr.length;i++){
//            for(int j=1;j<arr[0].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(var mat:arr){
            System.out.println("Rotate Matrix : "+ Arrays.toString(mat));
        }
    }
}
