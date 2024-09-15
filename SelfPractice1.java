import java.util.Scanner;
public class SelfPractice1 {
int mySum(int x,int y){
    int z=0;
    z=x+y;
    return z;
}

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        SelfPractice1 obj=new SelfPractice1();
        c=obj.mySum(a,b);
        System.out.println(c);
    }
}

