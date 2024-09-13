import java.util.ArrayList;

class Student1{
    private String name;
    private int id;
}
class Employee4{
    private String name;
    private int id;
}
public class GenericInJava2 {
    public static void main(String[] args) {
        Student1 st1=new Student1();
        Student1 st2=new Student1();
        Employee4 emp1=new Employee4();
        ArrayList<Student1>al=new ArrayList<Student1>();
        al.add(st1);
        al.add(st2);
        for(var str:al){
            System.out.println(str);

        }
        //al.add(e); compile time error occur
    }
}
