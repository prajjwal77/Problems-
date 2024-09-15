import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class PowerUsingRecursion {
    public  static int powerElement(int a,int b){
        int result=0,finalResult=0;
        //base case
        if(b==1){
            return a;
        }
        else {
            int mid=0;
            mid=b/2;
            result=powerElement(a,mid);
            finalResult=result*result;
        }
        if(b%2==0){
            return finalResult;
        }
        else {
            return a*finalResult;
        }
    }
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //function call
        int result=powerElement(a,b);
        System.out.println("Power of a^b is = "+result);
    }
}
