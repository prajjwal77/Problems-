import java.util.Scanner;
public class CbseCal {
    public static void main(String[] args) {
        float total=0;
        System.out.println("CBSE percentage Calculator:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Subject Marks:");
        float s1=sc.nextFloat();
        System.out.println("Enter Second Subject marks:");
        float s2=sc.nextFloat();
        System.out.println("Enter your third Subject Marks:");
        float s3=sc.nextFloat();
        System.out.println("Enter your fourth subject marks:");
        float s4=sc.nextFloat();
        System.out.println("Enter your fifth Subject Marks:");
        float s5=sc.nextFloat();
        total=s1+s2+s3+s4+s5;
        float per=(total/500)*100;
        System.out.println("Total percentage="+per);
    }
}
