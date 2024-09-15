//MultiThreading  by  extending Thread Class
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("Thread 1 is Running ...");
            System.out.println("I am Happy...");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
     int i=0;
     while(i<2000) {
     System.out.println("Thread 2 is Running .....");
     System.out.println("I am Sad...");
     i++;
     }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
    MyThread1 t1=new MyThread1();
    MyThread2 t2=new MyThread2();
    t1.start();
    t2.start();
    }
}
