import java.util.Scanner;
public class ProblemSolving6 {
    //1st solution-----------------------------
    static void multiply(int n) {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    //2nd Solution----------------------------------
    //pattern problem
    static void pattern(int n){
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<i+1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    //3rd Solution-------------------------
    static int  SumNatural(int n){
        if(n==1){
            return 1;
        }
        else
        {
         return n=n+SumNatural(n-1);
        }
    }
 //4th Solution------------------------------
    static void pattern2(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //5th Solution----------------------------
     static int fibonacci(int n){
        if(n==1||n==2)
        {
            return n-1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
     }

    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //1st..............
        //multiply(n);
        //2nd...............
        // pattern(n);
        //3rd...............
        //    int c=SumNatural(n);
        //    System.out.println(c);
        //4th...............
        //pattern2(n);
        //5th................
        //int result=fibonacci(n);
        //System.out.println(result);

    }
}
