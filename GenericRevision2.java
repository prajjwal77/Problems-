import java.util.ArrayList;

class Student11{
    private String name;
    private int id;
}
class Employee2{
    private String name;
    private int id;
}
public class GenericRevision2 {
    public static void main(String[] args) {
        Student11 st1=new Student11();
        Student11 st2=new Student11();
        Employee2 e=new Employee2();
        ArrayList<Student11>al=new ArrayList<Student11>();
        al.add(st1);
        al.add(st2);
        //al.add(e);//error Compile time



    }
}
