interface camera1{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello! , Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording 4K video...");
    }
}
interface MyWifi1{
    void connectWifi();
    void disConnect();
}
class CellPhone1{
    void callNumber(int number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone1 extends CellPhone1 implements camera1,MyWifi1{
    public void takeSnap(){
        System.out.println(" Taking Snap.");
    }
    public void recordVideo(){
        System.out.println("Recording Video.");
    }
    public void  connectWifi(){
        System.out.println("Connecting to Wifi.");
    }
    public void disConnect(){
        System.out.println("Disconnecting ......");
    }
    public  void meth1(){
        System.out.println("Method");
    }
}
public class PolymorphismInInheritance {
    public static void main(String[] args) {
        camera1 cam=new MySmartPhone1(); //this is smartphone but,use  it as camera.
        cam.record4KVideo();
        //cam.connectWifi();---> Not allowed
        MySmartPhone1 phone=new MySmartPhone1();
        phone.connectWifi();
        phone.callNumber(11122);
        phone.meth1();
        phone.disConnect();
    }
}
