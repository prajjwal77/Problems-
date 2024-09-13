public class ArraysOperations1 {
    public static void main(String[] args) {
//        int arr[]={10,28,44,5,66};
        int temp=0;
//        System.out.println("Before Sorting :");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.print("Array Sorting :\n");
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//            System.out.print(arr[i]+" ");
//        }
        int arr[]={10,28,44,5,66,100};
        int max=0;
        System.out.println();
        System.out.println("Maximum element  of array :");
    //    for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]>arr[i]){
//                    max=arr[j];
//                }
//            }

      //  }
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        System.out.print(max);


    }
}
