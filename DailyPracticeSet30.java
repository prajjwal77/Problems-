interface TvRemote{
    void powerOff();
    void powerOn();
    void foreward();
    void backward();
}
interface SmartTvRemote{
    void volume();
    void selectChannel();
}
class Tv implements  TvRemote,SmartTvRemote{
    public void powerOn(){
        System.out.println("Powering On :");
    }
     public void powerOff(){
        System.out.println("Powering Off :");
    }
     public void foreward()
    {
        System.out.println("Forewarding......");
    }
     public void backward(){
         System.out.println("Backwarding......");
     }
     public  void volume(){
         System.out.println("Volume increasing or decreasing....");
     }
     public void selectChannel(){
         System.out.println("Select Your channels..........");
    }
}
public class DailyPracticeSet30 {
    public static void main(String[] args) {
        Tv select=new Tv();
        select.powerOn();
        select.backward();
        select.foreward();
        select.backward();
        select.selectChannel();
        select.powerOff();

    }
}
