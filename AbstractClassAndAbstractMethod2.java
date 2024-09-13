abstract class Parent{
    public Parent(){
        System.out.println("Iam Base class Constructor.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning.");
    }

    @Override
    public void greet2() {
        System.out.println("Good AfterNoon.");
    }
}
abstract class Child3 extends Parent{
    public void meht(){
        System.out.println("I am  fine.");
    }
}
public class AbstractClassAndAbstractMethod2 {

    public static void main(String[] args) {
        //Parent p=new Parent();//error bcoz  parent is a abstract class
          Child ch=new Child();//it is a concrete class
         ch.greet();
          ch.greet2();
          //Child3 c3= new Child3(); //error bcoz child3 is a abstract class
    }
}
