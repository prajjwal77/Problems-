interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello, Good Morning.");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k......");
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling...."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone  implements MyWifi,MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap.");
    }
    public void recordVideo(){
        System.out.println("Recording snap.");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Network .");
        String[] networkList={"Prajjwal","Navneet","Yadav"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to  "+network);
    }
}
public class DefaultMethods2 {
    public static void main(String[] args) {
        MySmartPhone sp=new MySmartPhone();
        String [] ar=sp.getNetworks();
        for(String item:ar){
            System.out.print(item+" ");
        }
        System.out.println();
        sp.takeSnap();
        sp.recordVideo();
        sp.record4KVideo();
        sp.connectToNetwork("Prajjwal");
        sp.callNumber(7);
    }
}
