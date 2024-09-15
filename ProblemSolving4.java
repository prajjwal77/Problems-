import java.util.Scanner;
public class ProblemSolving4 {
    //PROBLEM SOLVING ------------------------------------" 4 "---------------------------------------------------------

    public static void main(String[] args) {
      //1st Solution-----------------------------------
//        for(int i=0;i<4;i++)
//        {
//            for(int j=4;j>i;j--)
//            {
//                System.out.print(" * ");

//            }
//            System.out.print("\n");
//        }
//        //2nd Solution-----------------------------------
//
     //   System.out.println("Enter any number to sum  the first even number : ");
        //Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=0;i<=n;i++)
//        {
//           sum=sum+(2*i);
//        }
//        System.out.println("Sum of first even number : ");
//        System.out.println(sum);
        //3rd Solution----------------------------------
        System.out.println("Enter any number to print their table :");
//
//        int table=sc.nextInt();
//        System.out.println("Table of "+table);
//        for(int j=1;j<=10;j++)
//        {
//            System.out.println(table+"*"+j+"="+table*j);
//        }
//4th Solution---------------------------------------
//        int rtable=sc.nextInt();
//        System.out.println("ReverseTable of "+rtable);
//        for(int j=10;j>=1;j--)
//        {
//            System.out.println(rtable+"*"+j+"="+rtable*j);
//        }
        //5th Solution----------------------------------------
//        int fact=1;
//        System.out.println("Enter any Number to find factorial :");
//        int n=sc.nextInt();
//        for(int i=n;i>=1;i--)
//        {
//            fact=fact*i;
//        }
//        System.out.println("factorial = "+fact);
        //6th Solution--------------------------------------
//        System.out.println("Enter number of time you want to print 5 or 1 :");
//        int n=sc.nextInt();
////       int i=1;
////       while(i<=n)
////        {
////            System.out.println("5");
////            i++;
////        }
//        //7th Solution------------------------
//
////        for(int i=1;i<=n;i++)
////        {
////            System.out.println("1");
////        }
//        int i=1;
//        while(i<=n)
//        {
//            System.out.println("1");
//            i++;
//        }
        //9th Solution------------------------------
        System.out.println("Enter any number to find the sum of table :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+(n*i);
        }
        System.out.println(sum);
    }
}
