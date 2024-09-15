class NewThread extends Thread{
    public NewThread(String name){
            super (name);
        }
        public void run(){
            int i=34;
            System.out.println("No! Thanks...");
        }
    }
public class MultiThreading3 {
    public static void main(String[] args) {
        NewThread t1=new NewThread("Prajjwal");
        NewThread t2=new NewThread("Navneet");
        t1.start();
        t2.start();
        System.out.println("The name of the thread t1 is "+t1.getName());
        System.out.println("The id of the thread t1 is "+t1.getId());
        System.out.println("The name of the thread t2 is "+t2.getName());
        System.out.println("The id of the thread t2 is "+t2.getId());
    }
}
