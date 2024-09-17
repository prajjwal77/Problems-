import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array Element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you target :");
        int x=sc.nextInt();
        int result=binarySearch(arr,x);
        if(result==0){
            System.out.println("Element NOt found : ");
        }
        else {
            System.out.println("Element found at Index : "+result);
        }
    }
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return 0;
        //Time Complexity =O(logN)
        //Space Complexity =O(1)
    }
}
