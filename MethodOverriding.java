class A{
    public void meth1(){
        System.out.println("I am a method of Class A ");
    }
        }
        class B extends A{
    @Override
    public void meth1(){
        System.out.println("i am a method of Class B");
    }
        }
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        B b=new B();
        b.meth1();
    }
}
