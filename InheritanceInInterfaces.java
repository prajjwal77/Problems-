import org.w3c.dom.ls.LSOutput;

interface simpleInterface{

    void meht1();
    void meht2();
}
interface childSimpleInterface extends simpleInterface{
    void meht3();
    void meht4();
}
class MySimpleClass implements childSimpleInterface{
     public void meht1(){
         System.out.println("Method 1...");
     }
    public void meht2(){
        System.out.println("Method 2...");
    }
    public void meht3(){
        System.out.println("Method 3...");
    }
    public void meht4(){
        System.out.println("Method 4...");
    }
}
public class InheritanceInInterfaces {
    public static void main(String[] args) {
            MySimpleClass my=new MySimpleClass();
        my.meht1();
        my.meht2();
        my.meht3();
        my.meht4();
    }
}
