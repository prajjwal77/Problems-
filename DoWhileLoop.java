import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
                   int b=1;
           do {
               System.out.println(b);
               b++;
           }while(b<5);

       int x=10;
       do {
           System.out.println(x);
           x++;
       }while(x<5);

       int a=1;//
       do {
           System.out.println(a);
           a++;
       }while(a<=10);
        Scanner sc=new Scanner(System.in);
        int n=1;
        System.out.println("Enter Any Number To Print Natural Number :");
        int m=sc.nextInt();
        do{
            System.out.println(n);
            n++;
        }while(n<=m);

    }
}
