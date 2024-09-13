class Phone{
    public void ShowTime(){
        System.out.println("Time is 10 pm......");
    }
    public void on(){
        System.out.println("Turning on Phone.....");
    }
}
class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Playing Music......");
    }
    public void on(){
        System.out.println("Turning on SmartPhone....");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ph=new SmartPhone();
        ph.ShowTime();
        ph.on();

    }
}
