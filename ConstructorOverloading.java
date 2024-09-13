class NewEmployee{
    private int id;
    private String  name;
    public NewEmployee(){
        id=90;
        name="Prajjwal";
    }
    public NewEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public NewEmployee(String myName){
        name=myName;
    }
    public  String  getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        NewEmployee obj1=new NewEmployee("Navneet",99);
        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
    }
}
