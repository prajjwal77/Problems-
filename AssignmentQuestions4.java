import java.util.Arrays;
public class AssignmentQuestions4 {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43,99};
        int max=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){//sorting of array
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){//printing sorted array

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array length :"+arr.length);//Array length start from 1
        int second_largest=arr[arr.length-2];//accessing second largest number in array
        System.out.println();
        System.out.println("Second Largest :"+second_largest);//printing second largest number
    }
}
