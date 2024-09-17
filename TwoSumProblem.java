import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        //input array element in array
        int arr[] = new int[n];
        System.out.print("Enter Array Element :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Enter your target
        System.out.println("Enter your target element : ");
        int target = sc.nextInt();
        //Create a HashMap where key is arr[i] and value is i
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n;i++){
            map.put(arr[i],i);
        }
        //create a result array to display the index of two number
        int[] result =new int [2];
        boolean b=false;
        //if current is equal to the target.......
        for(int i=0;i<n;i++) {
            if (arr[i] == target && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(i);
                break;
            } else if (map.containsKey(target - arr[i])) {
                //is the element non-repeatable.........
                if (map.get(target - arr[i]) > i) {
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
                //if two sum of element not present.......
                else{
                    b=true;
                }
            }
        }
        if(b == false) {
            System.out.println("Two Sum index values are : [" + result[0] + "," + result[1] + "]");
        }
        else{
            System.out.println("Element not present ");
        }
    }
}
