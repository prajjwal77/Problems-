import java.util.Scanner;
interface Bicycle{
    int a=55;
    void applyBreak(int decrement);
    void speedup(int increment);
}
class AvonCycle implements Bicycle{
    void BlowHorn(){
        System.out.println("PEE PEE POO POO");
    }
@Override
    public void applyBreak(int decrement) {

        System.out.println("Applying Break");

    }
    @Override
    public void speedup(int increment) {
        System.out.println("Applying Speedup");
    }
}
public class InterfaceInJava {
    public static void main(String[] args) {
        AvonCycle cycle=new AvonCycle();
        cycle.applyBreak(1);
        System.out.println(cycle.a);//we cannot modify the properties of Interfaces as they are final.
        cycle.BlowHorn();
        cycle.speedup(1);
    }
}
