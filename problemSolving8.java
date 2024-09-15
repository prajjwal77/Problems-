import java.util.Scanner;
class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
    }

    public double Volume() {
        return 3.142 * radius * radius * height;
    }
}
    class Rectangle1 {
        private int length;
        private int breadth;

        public Rectangle1(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getBreadth() {
            return breadth;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }
    }

class Sphere{
    private double radii;

    public Sphere(double radii) {
        this.radii = radii;
    }

    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }
    public double SurfaceArea(){
        return 4*3.142*radii*radii;
    }
    public double Volume(){
        return (4/3)*3.142*radii*radii;
    }
}
public class problemSolving8{
    public static void main(String[] args){
  //     1st Solution
     /*   object.setHeight(12);
        int h=object.getHeight();
        System.out.println(h);
        object.setRadius(9);
        int r=object.getRadius();
        System.out.println(r);
//        2nd Solution
        System.out.println(object.surfaceArea());
        System.out.println(object.Volume());
        */
//         3rd Solution
        /*Cylinder object=new Cylinder(9,12);
        System.out.println(object.surfaceArea());
        System.out.println(object.Volume());*/
        //4th Solution
      /*  Rectangle1 r=new Rectangle1(20,33);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth()); */
        //5th Solution
        Sphere s=new Sphere(10);
        System.out.println(s.getRadii());
        System.out.println(s.SurfaceArea());
        System.out.println(s.Volume());
    }
}
