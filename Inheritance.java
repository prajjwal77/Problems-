class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Base B=new Base();
        B.setX(44);
        System.out.println(B.getX());
        Derived D=new Derived();
        D.setY(50);
        System.out.println(D.getY());
        D.setX(90);
       System.out.println(D.getX());
    }
}
