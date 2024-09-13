import java.util.Scanner;
import java.util.concurrent.Callable;

class Circle{
    private double radius;
    public void setRadius(double n){
        radius=n;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getParameter(){
        return  2*(3.14*radius);}
}
public class GettersAndSettersExamples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        Circle cr=new Circle();
        cr.setRadius(n);
        System.out.println("Radius of circle :"+cr.getRadius());
        System.out.println("Area of circle :"+cr.getArea());
        System.out.println("Parameter of Circle :"+cr.getParameter());
    }
}
