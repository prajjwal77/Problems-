import java.util.Scanner;

public class LinearSearch {
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
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found :");
        }
        else{
            System.out.println("Element found at index :"+index);
        }
        //Time Complexity =O(n)
        //Space Complexity =O(1)
    }
}
