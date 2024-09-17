import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {
    public  static  int  fibonacci(int n){
        int result=0;
        if(n<=1){
            return n;
        }
        else {
            result= fibonacci(n-1)+fibonacci(n-2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of n :");
        int n=sc.nextInt();
        //function calling
        int result=fibonacci(n);
        System.out.println("Final output is : "+result);
    }
}
