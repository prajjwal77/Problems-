import java.util.Scanner;
public class ProblemSolving5 {

    public static void main(String[] args) {
//1st Solution-------------------------------------
    /*float[] arr={101.1f,202.2f,333.6f,453.4f,234.4f};
    float sum=0;
    // for(int i=0;i<arr.length;i++){
        //  sum=sum+arr[i];
 //   }
        for(float element:arr)
        {
            sum=sum+element;
        }
        System.out.println("Sum of given Array ="+sum);*/
        //2nd Solution---------------------------------
        /* float[] arr={101.1f,202.2f,333.6f,453.4f,234.4f};
    float num=202.2f;
    boolean isInArray=false;
    for(float element:arr){
        if(num==element)
        {
            isInArray=true;
            break;
        }
    }if(isInArray){
        System.out.println("The value is present in the array ");
    }
    else{
            System.out.println("The value is not present in array");
        }*/
//3rd Solution---------------------------------------------
//float[] arr={101.1f,202.2f,333.6f,453.4f,234.4f};
//float sum=0;
//for(float element:arr){
//    sum+=element;
//}
//        System.out.println("Average of marks= "+sum/arr.length);
//
        //4th solution-------------------------------------
        /* int [][] matrix1={ {1,2,3},
                         {4,5,6}};
        int [][] matrix2={ {7,8,9},
                          { 10,11,1}};
        int[][] result={{0,0,0},
                {0,0,0}};
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[i].length;j++)
            {
                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<matrix1.length;i++)
        {
        for(int j=0;j<matrix1[i].length;j++)
        {
            System.out.print(result[i][j]+" ");
          //  result[i][j]=matrix1[i][j]+matrix2[i][j];
        }
            System.out.println("");
    }
*/
// 5th solution-----------------------------------------
//int [] arr={1,2,4,5,6,7};
//int l=arr.length;
//int n=Math.floorDiv(l,2);
//int temp;
//for(int i=0;i<n;i++){
//    temp=arr[i];
//    arr[i]=arr[l-i-1];
//    arr[l-i-1]=temp;
//}
//for(int element:arr){
//    System.out.print(element+" ");
//}
        //6th Solution----------------------------------------
  /*      int [] arr={11,22,55,83,77};
        int max=Integer.MIN_VALUE;
     //1st method
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
 //2nd method
        for(int element:arr)
        {
            if(element>max){
                max=element;
            }
        }
        System.out.print("maximum element = "+max); */
        //7th Solution-------------------------------
        int [] arr={11,22,55,83,77};
        int min=Integer.MAX_VALUE;
       //1st method
        /* for(int i=0;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                max=arr[i];
            }
        }*/
        for(int element:arr)
        {
            if(element<min){
                min=element;
            }
        }
        System.out.print("maximum element = "+min);

    }
}