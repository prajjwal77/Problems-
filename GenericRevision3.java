import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

class Gen<T>{
    T obj;
    public Gen(T obj){
        this.obj=obj;
    }
    public void display(){
        System.out.println("The type of data is : "+ obj.getClass().getName());
    }
    public T getobj(){
        return obj;
    }
}
public class GenericRevision3 {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(10);
        g.display();
        System.out.println(g.getobj());
        System.out.println("*******************************************");
        Gen<String>g1=new Gen<String>("Prajjwal");
        g1.display();
        System.out.println(g1.getobj());
    }
}
