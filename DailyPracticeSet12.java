import java.util.Scanner;

public class DailyPracticeSet12 {
    //Finding the HCF or GCD of two number -----
    public static void main(String[] args) {
         int n,m;
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter first and second Number to finding the HCF and GCD : ");
         n=scan.nextInt();
         m=scan.nextInt();
         int gcd=1;
         for(int i=1;i<=n&&i<=m;++i) {
             //checking if i perfectly divides both of n and m
             if (n % i == 0 && m % i == 0)
                 gcd = i;
         }
             System.out.println("GCD of "+n+" and "+m+" is = "+gcd);

    }
}
