
import java.security.SecureRandom;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array : ");
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int [] arr1=new int[20];
        System.out.println("Enter your Array Element : ");
        for(int  i=1;i<=size;i++){
            System.out.printf("Enter element %d :",i);
            arr1[i]=scan.nextInt();
        }
        System.out.println("Array elements are :");
        for (int i=1;i<=size;i++){
        System.out.print(+arr1[i]+ " ");
         }
        System.out.println();
        System.out.println("Sorted Array :");
        int temp=0;
        for(int i=1; i<=size;i++) {
            for(int j=i+1;j<=size;j++){
                if (arr1[i] > arr1[j]) {
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
            System.out.print(arr1[i] + " ");
        }
    }
}
