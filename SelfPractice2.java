import java.util.Scanner;
public class SelfPractice2 {
    static void fun(int n){
        if(n>0) {
            fun(n - 1);
            System.out.println(n);
        }
    }
    static void fun2(int n){
        if(n>0){
            System.out.println(n);
            fun2(n-1);
        }
    }

    public static void main(String[] args) {
        int x=3;
 fun(x);
 fun2(x);
    }
}
