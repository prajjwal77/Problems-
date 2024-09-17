import java.util.Scanner;

public class FirstOccurance {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("ENtr array Element : ");
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
            System.out.println("Target Element first occurance at Index : "+result);
        }
    }
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result= mid;
                high=mid-1;
            } else if (arr[mid]>target) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
        //Time complexity = O(logN)
        //Space Complexity = O(1)
    }

}
