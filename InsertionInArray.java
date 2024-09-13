import java.util.Scanner;

public class InsertionInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Entered Array :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Enter the position to add new array element :");
        int pos=scan.nextInt();
        System.out.println("Enter new element int array : ");
        int item=scan.nextInt();
        for(int i=size;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=item;
        size++;
        System.out.println("After Insertion : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
