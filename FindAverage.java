import java.util.Scanner;
public class FindAverage {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of subject");
        int n= sc.nextInt();
        int[] a=new int [n];
        double avg=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            avg=avg+a[i];
        }
        System.out.print("Average of(");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println(") = "+avg/n);

    }
}
