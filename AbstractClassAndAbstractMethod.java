abstract  class Phone1{
    abstract void on();
}
class SmartPhone1 extends Phone1{
    void on(){
        System.out.println("Turning on.......");
    }

}
public class AbstractClassAndAbstractMethod {
    public static void main(String[] args) {
        Phone1 p1=new SmartPhone1();
        p1.on();
    }
}
