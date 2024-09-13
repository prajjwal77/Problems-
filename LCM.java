import java.sql.SQLOutput;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int n,m,lcm;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two number to find the LCM : ");
        n=scan.nextInt();
        m=scan.nextInt();
        //maximum number between n and m is stored in lcm
        lcm= (n > m) ? n : m;
        //Always True
        while (true){
            if(lcm %n ==0 && lcm % m==0 ){
                System.out.printf("The LCM of %d and %d  is %d.",n,m,lcm);
                break;
            }
            ++lcm;
        }
    }
}
