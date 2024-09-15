//Solution 1 and 2.......................
abstract class Pen{
    abstract void write();
      abstract void refill();
}
class FountainPen extends Pen{
      public  void write(){
        System.out.println("Write....");
    }
    public void refill(){
        System.out.println("Refill....");
    }
    public  void changeNib(){
        System.out.println(" Changing  new Nib.....");
    }
}
public class ProblemSolving9 {
    public static void main(String[] args) {
        FountainPen obj=new FountainPen();
        obj.write();
        obj.refill();
        obj.changeNib();
    }
}
