import java.util.Scanner;
public class MethodInJava {
    static int logic1(int x,int y){ //We can call static function without creating an object in static main
        int z=0;
        if(x>y){
            z=x+y;
        }
        else
        {
            z=(x+y)*2;
        }
        return z;
    }
     int logic2(int x,int y){
        int z=0;
        if(x>y){
            z=x+y;
        }
        else
        {
            z=(x*y)*2;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c1;
        int c2;
        c1=logic1(a,b);
        MethodInJava obj=new MethodInJava();//creating an object of logic2 function
       c2 = obj.logic2(a,b);
       System.out.println(c1);
       System.out.println(c2);
    }
}
