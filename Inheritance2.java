import java.sql.SQLOutput;

class Animal{
    public void eat(){
        System.out.println("Animals are plants,meat,etc");
    }

}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks Woo woo!");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Dog D=new Dog();
       D.eat();
       D.sound();
    }
}
