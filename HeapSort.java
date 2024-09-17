public class HeapSort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void heapify(int[] arr,int n,int i){
        int largest =i;//initialise largest as root
        int l=2*i+1;
        int r=2*i+2;
        //if left child is larger  than root
        if(l<n&& arr[l]>arr[largest]){
            largest=l;
        }
        //if right child i larger than largest so far
        if(r<n&&arr[r]>arr[largest]){
            largest=r;
        }
        //if largest is not root
        if(largest!=i){
            swap(arr,i,largest);
            //recursively heapify the affected su-tree
            heapify(arr,n,largest);
        }
    }
    public static void heapsort(int[] arr,int n){
        //built heap (rearrange array)
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            //move current root to end
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            //call max heapify on the reduced heap
            heapify(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int[] arr={12,11,5,13,7};
        heapsort(arr,arr.length);
        printArray(arr,arr.length);
    }
}
