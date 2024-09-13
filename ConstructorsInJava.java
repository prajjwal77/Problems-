class myEmployee{
    myEmployee(String s,int i){
        System.out.println("The name of second Employee is : "+s);
        System.out.println("The id of second Employee id : "+i);
    }myEmployee(String s, int i,int salary) {
        System.out.println("The name of second Employee is : " + s);
        System.out.println("The is of second Employee is : " + i);
        System.out.println("The salary of second Employee is : " + salary);
    }
}
public class ConstructorsInJava {
    public static void main(String[] args) {
        myEmployee emp1=new myEmployee("Prajjwal",20);
        myEmployee emp2=new myEmployee("Navneet",21,700000);
    }
}
