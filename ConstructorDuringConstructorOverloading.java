class Base11{
    Base11(){
        System.out.println("I am base class constructor .");
    }
    Base11(int x){
        System.out.println("I am overloaded constructor with value x is = "+x);
    }
}
class Derived11 extends Base11{
    Derived11(){
        System.out.println("I am derived class Constructor .");
    }
    Derived11(int x,int y){
        super(x);
        System.out.println("I am overloaded constructor with value y is = "+y);
    }
}
class ChildOfDerived11 extends Derived11{
     ChildOfDerived11() {
        System.out.println(" I am ChildOfDerived11 constructor .");
    }
ChildOfDerived11(int x,int y ,int z){
         super(x,y);
    System.out.println("I am Overloaded constructor with value of x is = " +z);
}

}
public class ConstructorDuringConstructorOverloading {
    public static void main(String[] args) {
       // ChildOfDerived11 cd=new ChildOfDerived11();
        ChildOfDerived11 cd=new ChildOfDerived11(1,2,3);
    }
}
