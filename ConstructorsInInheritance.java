import org.w3c.dom.ls.LSOutput;

class Base1{
Base1(){
    System.out.println("I am base class Constructor");
}
Base1(int x){
    System.out.println("I am  Base class Constructor overloaded with value x is :"+x);
}

}
class Derived1 extends Base1{
    public Derived1() {
        System.out.println("I am a derived class Constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a  Derived class Constructor overloaded  with value y is :"+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am  Constructor of ChildOfDerived Class");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am ChildOfDerived  class Constructor with value z is :"+z);
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
//        Derived1 D1 = new Derived1(3,4);
    ChildOfDerived Cd=new ChildOfDerived(6,7,8);
    }
}

