public class DandCQuickSort {
    public static void quickSort(int[] arr,int l,int h){
        if(l<h){
            //1. Divide the array into sub problem
            int m=partition(arr,l,h);
            //2.Conquer those sub problem via Recursion
            quickSort(arr,l,m-1);
            quickSort(arr,m+1,h);
            //3.No need of combine part
        }
    }
    public static int partition(int[] arr,int l,int h){
        int i=l;
        //pivot as the first element in an array
        int pivot=arr[l];
        //j-> to take bigger element than pivot
        //i-> to take smaller element then pivot
        for(int j=l+1;j<=h;j++){
            if(arr[j]<=pivot){
                i=i+1;
                //swap (arr[i],arr[j])
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //to return the correct index of the pivot element
        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void printArr(int [] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[]={50,20,70,90,10,13,17,21};
        int n=arr.length;
        System.out.println("Array before sorting :");
        printArr(arr,n);
        System.out.println("After sorting of array :");
        quickSort(arr,0,n-1);
        printArr(arr,n);
        //Time complexity =0(n logn)
        //Space complexity =0(n*n)
    }
}
