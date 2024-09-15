import java.util.Scanner;
//1st Solution-----------------------------
class Employee1{
    int  salary;
    String name;
    public int  getSalary()
    {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
//@nd Solution---------------------------
class cellPhone{
    public void ring(){
        System.out.println("RInging");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void call(){
        System.out.println("Calling ..........Rahul");
    }
    public  void off(){
        System.out.println("Turning Switch off");
    }
}
//3rd Solution------------------------------
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}
//4th Solution-------------------------
class Pubg{
    public void hit(){
        System.out.println("Hitting by the enemy");
    }
    public void  run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing to enemy");
    }

}
//5th Solution------------------------------
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int parameter(){
        return 2*(length+breadth);
    }
}
public class ProblemSolving7 {

    public static void main(String[] args) {
   /*     Employee1 obj=new Employee1();
        obj.name="Navneet yadav";
        obj.setName("Prajjwal Yadav");
        obj.salary=60000;
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
  */
       /* cellPhone phone=new cellPhone();
        phone.vibrate();
        phone.ring();
        phone.call();
        phone.off();
        */
        /* Square obj=new Square();
        obj.side=10;
        int area =obj.area();
        System.out.println("Area is = "+area);
        int para=obj.parameter();
        System.out.println("Parameter is = "+para);
    */
       /* Pubg game=new Pubg();
        game.hit();
        game.run();
        game.fire();
    */
        Rectangle para=new Rectangle();
        para.length=10;
        para.breadth=5;
        System.out.println("Area of rectangle = "+para.area());
        System.out.println("Parameter of rectangle = "+para.parameter());
    }


}
