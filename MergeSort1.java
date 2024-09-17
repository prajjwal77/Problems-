public class MergeSort1 {
//    public static int [] Sorting(int[] arr){
//        return mergeSort(arr,0,arr.length);
//    }
    public static int []mergeSort(int [] arr, int start, int end){
        if(end-start==1){
            return  new int[] {arr[start]};
        }
        //divide
        int mid=start+(end-start)/2;
        int[] left=mergeSort(arr,0,mid);
        int[] right=mergeSort(arr,mid,end);
        int l1=left.length;
        int l2=right.length;
        //conquer or solve
        int[] mergeArr=new int [l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2){
            if(mergeArr[i] < mergeArr[j]){
                mergeArr[k++]=left[i++];
            }else{
                mergeArr[k++]=right[j++];
            }
            while(i<l1){
                mergeArr[k++]=left[i++];
            }
            while(j<l2){
                mergeArr[k++]=right[j++];
            }
        }
        return  mergeArr;
    }
    public static void printArr(int[] arr,int n){
        for(int i=0;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr={7,4,8,9,3,6,2,1};
        printArr(arr,arr.length);
        int [] temp=mergeSort(arr,0,arr.length);
        printArr(temp,temp.length);
    }
}
