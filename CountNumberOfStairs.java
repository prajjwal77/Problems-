import java.util.Scanner;
//Time Complexity =O(2^n)
//Space Complexity =O(n)
public class CountNumberOfStairs {
    public static int countingStair(int n){
        int res;
        if(n<=1){
            return n;
        }
        else {
            res=countingStair(n-1)+countingStair(n-2);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of stairs :");
        int n=sc.nextInt();
        //function calling
        int result=countingStair(n+1);
        System.out.println("Number of ways : "+result);
    }
}
