import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SequenceOfStringUsingRecursion {
    public static void printSequence(int[] arr, int index, ArrayList<Integer>tempArr) {
        //base case
        if (index == arr.length) {
            //print sequence - but do not print empty entries
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }
        //recursive call
        //include
        printSequence(arr, index + 1, tempArr);
        //add the value int tempArr
        tempArr.add(arr[index]);
        //do not include
        printSequence(arr, index + 1, tempArr);
        //remove the last value
        tempArr.remove(tempArr.size() - 1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter element  of arrays : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("For the array - "+Arrays
                .toString(arr));
                printSequence(arr,0,new ArrayList<>());
    }
}
