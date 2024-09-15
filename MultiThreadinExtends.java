import com.sun.security.jgss.GSSUtil;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.concurrent.Callable;

class Calc1 extends Thread{
    public  void run(){
        System.out.println("Calculating task Started..");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number...");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number...");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println(res);
        System.out.println("Calculation Task ENded.......");
        System.out.println("*******************************************");
    }
}
class Messages1 extends Thread{
    public void run(){
        System.out.println("Displaying Important message task..");
        try{
            for(int i=0;i<3;i++){
                System.out.println("Focus is Important to master a Skills...");
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            System.out.println("Some Problem...");
        }
        System.out.println("Displaying Important message Task Ended....");
    }
}
public class MultiThreadinExtends {
    public static void main(String[] args) {
        Calc1 t1=new Calc1();
        Messages1 t2=new Messages1();
        t1.start();
        t2.start();
    }
}
