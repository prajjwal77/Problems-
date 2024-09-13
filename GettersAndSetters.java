class MyEmployee{
    private int id;
    private  String name ;
    public String  getName(){
        return  name;
    }
    public void setName(String  n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }

    public int getId() {
        return id;
    }
}
public class GettersAndSetters {

    public static void main(String[] args) {
 MyEmployee prajjwal=new MyEmployee();
         prajjwal.setName("Hi i am ,Prajjwal yadav");
        System.out.println(prajjwal.getName());
        prajjwal.setId(19);
        System.out.println(prajjwal.getId());
    }
}
