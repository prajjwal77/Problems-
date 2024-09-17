import java.util.*;

public class DandCMergeSort {
    //function to do the combine task inn mergesort - mergeProcedure
    public static void mergeProcedure(int[] arr,int l,int mid,int r){
        //l=lower index and r= right index (suppose i=l an j=r)
        int i,j,k;
        //size of the left and  right sub-array
        int n1=mid-l+1;
        int n2=r-mid;
        //create left and right  sub-array
        int[] lSubArray=new int[n1];
        int[] rSubArray=new int[n2];
        //create the data into the left and right sub-array
        for(i=0;i<n1;i++){
            lSubArray[i]=arr[l+1];
        }
        for(j=0;j<n1;j++){
            lSubArray[j]=arr[mid+1];
        }
        //comparison b/w the element in the left and right sub array
        i=0;
        j=0;
        k=l;
        while(i<n1&&l<n2){
            if(lSubArray[i]<=rSubArray[j]){
                arr[k]=lSubArray[i];
                i=i+1;
            }
            else {
                arr[k]=rSubArray[j];
                j=j+1;
            }
            k=k+1;
        }
        //copying all the remaining element from the left sub array
        while(i<n1){
            arr[k]=lSubArray[i];
            i=i+1;
            k=k+1;
        }

        //copying all the  remaining element from the right sub array

        while(j<n2){
            arr[k]=rSubArray[j];
            j=j+1;
            k=k+1;
        }
    }
    public static void mergeSort(int[] arr, int i,int j){
        if(i<j){
            //1. Divide the array into two  sub problems
            int mid =i+(j-i)/2;
            //2. Conquer the sub problems using recursion
            //left sub-array
            mergeSort(arr,i,mid);
            //right  sub-array
            mergeSort(arr,mid+1,j);
            //3. Combine the solution of all the program
            mergeProcedure(arr,i,mid,j);
        }
    }
    //function to display
    public  static void printArr(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
      int[] arr={50,20,40,90,88,11,13};
      int n=arr.length;
        System.out.println("Array Before Sorting is :");
        printArr(arr,n);
        System.out.println("Array After Sorting is :");
        mergeSort(arr,0,n-1);
        printArr(arr,n);
    }
}
