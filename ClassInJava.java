import java.util.Scanner;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("my id is :"+id);
        System.out.println("my name  is : "+name);
    }
    public int getSalary(){
        return  salary;
    }

};
public class ClassInJava {
    public static void main(String[] args) {
        System.out.println("This is custom class: ");
        Employee object1=new Employee();
        Employee object2=new Employee();
        object1.id=10;
        object1.salary=70000;
        object1.name="Prajjwal yadav";
        object1.printDetails();
        int salary= object1.getSalary();
        System.out.println("Salary = "+salary);

        object2.id=11;
        object2.salary=80000;
        object2.name="Navneet yadav";
        object2.printDetails();
        int salary1=object2.getSalary();
        System.out.println("Salary = "+salary1);
    }
}
