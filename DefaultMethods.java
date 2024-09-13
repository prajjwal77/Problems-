interface MyAnimal{
    default void say(){
        System.out.println("hello, this is default method.");
    }
    void bark();
}
 class MyClass1 implements MyAnimal {
    @Override
    public void bark() {
        System.out.println("Dog Barks.");
    }

}

public class DefaultMethods{
    public static void main(String[] args) {
        MyClass1 ch=new MyClass1();
        ch.bark();
        ch.say();
    }
}
