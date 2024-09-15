// 3rd and 4 th Solution..................
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
     public void bite(){
         System.out.println(" Bite... ");
     }
    public  void jump(){
        System.out.println(" Jumping...");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println(" Every Animal eating....");
    }
    public void sleep(){
        System.out.println(" Every Animal Sleeping....");
    }
}
public class ProblemSolving9Q3 {
    public static void main(String[] args) {
        Human Animal=new Human();
     Animal.eat();
     Animal.sleep();
    //Animal.jump();
    //Animal.bite();
    //Demonstrating ... Polymorphism ...
    Monkey monk=new Human();
    monk.bite();
    monk.jump();
    }
}
