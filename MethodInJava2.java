import  java.util.Scanner;
//Method Over loading
//a-> By CHANGING THE RETURN TYPE
public class MethodInJava2 {
int multiply(int a,int b)//passing  2 parameter
{
    return a*b;
}
double multiply(double a,double b)//passing  2 parameter
{

    return a*b;
}
//B->BY CHANGING THE NUMBER OF ARGUMENTS PASSED
    int sum(int a,int b)//passing  2 parameter
    {
    return a+b;
}
int sum(int a,int b,int c)//passing  3 parameter
{
    return a+b+c;
}
    public static void main(String[] args) {
        MethodInJava2 obj=new MethodInJava2() ;
int c=obj.multiply(4,5);
double d=obj.multiply(4.1,5.2);

        System.out.println("return Integer:"+c);
        System.out.println("return Double:"+d);
int x=obj.sum(5,10);
int y=obj.sum(10,20,30);
        System.out.println("Return integer sum two argument: "+x);
        System.out.println("Return integer sum three argument: "+y);
}
}
