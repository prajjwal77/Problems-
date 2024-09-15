import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
     //   System.out.println("Enter Number of subject");
       // int n=sc.nextInt();
        int[] a=new int[5];
        int ob=0;
         int total=500;
        float percent=0;
        System.out.println("ENter your  5 Subject marks");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
    for(i=0;i<5;i++)
    {
        ob=ob+a[i];
    }
        System.out.println(ob);
    percent=ob/5;
        System.out.println("Total percentage ="+percent);
    }

}
