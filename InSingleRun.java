import java.util.Scanner;

class MyThread11 extends Thread{
    public void run(){
        String tName=Thread.currentThread().getName();
        if(tName.equals("CALC")){
            calc();
        }
        else{
            importantMesg();
        }
    }
    public void calc(){
        System.out.println("Calculation task Started..");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number....");
        int num1=sc.nextInt();
        System.out.println("ENter second Number....");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println(res);
        System.out.println("Calculation Task Ended...");
        System.out.println("*****************************************");
    }
    public void  importantMesg(){
        System.out.println("Displaying Important  message task.....");
        try{
            for(int i=0;i<3;i++){
                System.out.println("Focus is important to master a skills.");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Some problem occurs....");
        }
        System.out.println("Displaying important message task ended.....");
    }
}
public class InSingleRun {
    public static void main(String[] args) {
        System.out.println("Main thread started......");
        MyThread11 thread1=new MyThread11();
        MyThread11 thread2=new MyThread11();
        thread1.setName("CALC");
        thread2.setName("PRINT");
        thread1.start();
        thread2.start();

    }
}
